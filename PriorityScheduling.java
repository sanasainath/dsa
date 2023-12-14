import java.util.*;

class Process {
    String name;
    int arrivalTime;
    int burstTime;
    int priority;
    int completionTime;
    int turnaroundTime;
    int waitingTime;
    boolean completed;

    Process(String name, int arrivalTime, int burstTime, int priority) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
        this.completionTime = 0;
        this.turnaroundTime = 0;
        this.waitingTime = 0;
        this.completed = false;
    }
}

public class PriorityScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        List<Process> processes = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter arrival time for Process P" + i + ": ");
            int arrivalTime = scanner.nextInt();

            System.out.print("Enter burst time for Process P" + i + ": ");
            int burstTime = scanner.nextInt();

            System.out.print("Enter priority for Process P" + i + ": ");
            int priority = scanner.nextInt();

            processes.add(new Process("P" + i, arrivalTime, burstTime, priority));
        }

        int currentTime = 0;
        int totalTurnaroundTime = 0;
        int totalWaitingTime = 0;

        while (true) {
            Process currentProcess = null;
            int highestPriority = Integer.MAX_VALUE;

            for (Process process : processes) {
                if (!process.completed && process.arrivalTime <= currentTime && process.priority < highestPriority) {
                    currentProcess = process;
                    highestPriority = process.priority;
                }
            }

            if (currentProcess == null) {
                currentTime++;
            } else {
                currentProcess.burstTime--;
                currentTime++;

                if (currentProcess.burstTime == 0) {
                    currentProcess.completionTime = currentTime;
                    currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
                    currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;

                    currentProcess.completed = true;
                    totalTurnaroundTime += currentProcess.turnaroundTime;
                    totalWaitingTime += currentProcess.waitingTime;
                }
            }

            boolean allCompleted = true;
            for (Process process : processes) {
                if (!process.completed) {
                    allCompleted = false;
                    break;
                }
            }

            if (allCompleted) {
                break;
            }
        }

        double averageTurnaroundTime = (double) totalTurnaroundTime / n;
        double averageWaitingTime = (double) totalWaitingTime / n;

        System.out.println(
                "\nProcess\tArrival Time\tBurst Time\tPriority\tCompletion Time\tTurnaround Time\tWaiting Time");

        for (Process process : processes) {
            System.out.println(process.name + "\t" + process.arrivalTime + "\t\t" +
                    process.burstTime + "\t\t"
                    + process.priority + "\t\t" + process.completionTime + "\t\t" + process.turnaroundTime + "\t\t"
                    + process.waitingTime);
        }

        System.out.println("\nAverage Turnaround Time: " + averageTurnaroundTime);
        System.out.println("Average Waiting Time: " + averageWaitingTime);
    }
}
