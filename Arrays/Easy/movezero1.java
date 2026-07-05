package Arrays.Easy;
/*Move Zeros to End
Easy

Hints
Company
Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.



This must be done in place, without making a copy of the array.


Example 1

Input: nums = [0, 1, 4, 0, 5, 2]

Output: [1, 4, 5, 2, 0, 0]

Explanation:

Both the zeroes are moved to the end and the order of the other elements stay the same

Example 2

Input: nums = [0, 0, 0, 1, 3, -2]

Output: [1, 3, -2, 0, 0, 0]

Explanation:

All 3 zeroes are moved to the end and the order of the other elements stay the same

Example 3

Input: nums = [0, 20, 0, -20, 0, 20]

Output:

[20, -20, 20, 0, 0, 0] */
import java.util.*;

class Solution {
    // Function to move zeroes to the end
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        // Create a temporary array to store non-zero elements
        int[] temp = new int[n];
        int count = 0;

        // Copy non-zero elements to temp
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[count++] = nums[i];
            }
        }

        // Copy non-zero elements back to nums
        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }

        // Fill the rest with zeroes
        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        // Create an instance of Solution class
        Solution sol = new Solution();
        sol.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        // Print the modified array
        System.out.println(Arrays.toString(nums));
    }
}
