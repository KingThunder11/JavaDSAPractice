import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // for troubleshooting
        // nested for-loop
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                // sum with next term
                sum += arr[j];
                
                // if sum == target, leave both loops
                if (sum == target) {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(i + 1);
                    result.add(j + 1);
                    return result;
                }
                // if sum > target, leave for loop
                if (sum > target) {
                    break;
                }
            }
        }
        
        // no subarray found
        ArrayList<Integer> noResult = new ArrayList<>();
        noResult.add(-1);
        return noResult;
    }
}