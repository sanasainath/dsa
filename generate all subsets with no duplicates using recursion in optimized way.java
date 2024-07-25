import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        findSubsets(result, arr, new ArrayList<>(), 0);
        return result;
    }

    private static void findSubsets(ArrayList<ArrayList<Integer>> result, int[] arr, ArrayList<Integer> current, int index) {
        result.add(new ArrayList<>(current));
        for (int j = index; j < arr.length; j++) {
            if (j > index && arr[j] == arr[j - 1]) {
                continue; // Skip duplicates
            }
            current.add(arr[j]);
            findSubsets(result, arr, current, j + 1);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
