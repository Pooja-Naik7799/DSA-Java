package Arrays.Easy;

import java.util.Arrays;

class Solution {
    //  Function to find the missing number
    public int missingNumber(int[] nums) {
        int N = nums.length; 
        
        // Array to store frequencies, initialized to 0
        int[] freq = new int[N+1];
        
        // Storing the frequencies in the array
        for (int num : nums) {
            freq[num]++;
        }
        
        // Checking the frequencies for numbers 0 to N
        for (int i = 0; i <= N; i++) {
            if (freq[i] == 0) {
                return i;
            }
        }
        
        /* This line will never execute, 
        it is just to avoid warnings */
        return -1;
    }
}

 class Main {
    public static void main(String[] args) {
        int[] nums = {0,1, 2, 4};
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        /* Call the missingNumber method 
        to find the missing number */
        int ans = solution.missingNumber(nums);
        
        System.out.println("The missing number is: " + ans);
    }
}

