package Arrays.Easy;
/*Find missing number
Easy

Hints
Company
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.


Example 1

Input: nums = [0, 2, 3, 1, 4]

Output: 5

Explanation:

nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]

Example 2

Input: nums = [0, 1, 2, 4, 5, 6]

Output: 3

Explanation:

nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]

Example 3

Input: nums = [1, 3, 6, 4, 2, 5]

Output:
0

All the numbers of nums are unique. */
import java.util.*;

class Solution {
    // Function to find the missing number
    public int missingNumber(int[] nums) {
        // Calculate N from the length of nums
        int N = nums.length;
        
        // Outer loop that runs from 0 to N
        for (int i = 0; i <= N; i++) {
            /* Flag variable to check 
            if an element exists*/
            int flag = 0;
            
            /* Search for the element 
            using linear search*/
            for (int j = 0; j < N; j++) {
                if (nums[j] == i) {
                    // i is present in the array
                    flag = 1;
                    break;
                }
            }
            
            // Check if the element is missing (flag == 0)
            if (flag == 0) return i;
        }
        
        /* The following line will never 
        execute, it is just to avoid warnings*/
        return -1;
    }
}

 class Main {
    public static void main(String[] args) {
        // Example array with missing number
        int[] nums = {0,1, 2, 4};
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the missingNumber method to find the missing number
        int ans = solution.missingNumber(nums);
        
        // Output the missing number
        System.out.println("The missing number is: " + ans);
    }
}

