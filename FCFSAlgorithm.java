import java.util.Scanner;

public class FCFSAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];
        int[] completionTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];
        int[] responseTime = new int[n];

        System.out.println("Enter arrival time and burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + " - Arrival Time: ");
            arrivalTime[i] = scanner.nextInt();
            System.out.print("Process " + (i + 1) + " - Burst Time: ");
            burstTime[i] = scanner.nextInt();
        }

        // Calculate completion time, waiting time, turnaround time, and response time
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            if (currentTime < arrivalTime[i]) {
                currentTime = arrivalTime[i];
            }
            completionTime[i] = currentTime + burstTime[i];
            turnaroundTime[i] = completionTime[i] - arrivalTime[i];
            waitingTime[i] = turnaroundTime[i] - burstTime[i];
            responseTime[i] = waitingTime[i];
            currentTime = completionTime[i];
        }

        // Calculate average waiting time and turnaround time
        double avgWaitingTime = 0;
        double avgTurnaroundTime = 0;
        for (int i = 0; i < n; i++) {
            avgWaitingTime += waitingTime[i];
            avgTurnaroundTime += turnaroundTime[i];
        }
        avgWaitingTime /= n;
        avgTurnaroundTime /= n;

        // Display the results
        System.out.println(
                "\nProcess\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time\tTurnaround Time\tResponse Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + arrivalTime[i] + "\t\t" + burstTime[i] + "\t\t" + completionTime[i]
                    + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i] + "\t\t" + responseTime[i]);
        }

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);

        scanner.close();
    }
}
