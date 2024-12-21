//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            ArrayList<Integer> result = ob.subarraySum(nums, d);
            // Print all elements in the result list
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a new line after the result
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        // nested for-loop
        for (int i = 0; i < arr.length; i++) {
        int sum = 0;
            for (int j = i; j < arr.length - 1; j++) {
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