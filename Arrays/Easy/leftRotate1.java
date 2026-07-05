package Arrays.Easy;
/*Left Rotate Array by K Places
Easy

Hints
Company
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.


Example 1

Input: nums = [1, 2, 3, 4, 5, 6], k = 2

Output: nums = [3, 4, 5, 6, 1, 2]

Explanation:

rotate 1 step to the left: [2, 3, 4, 5, 6, 1]

rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

Example 2

Input: nums = [3, 4, 1, 5, 3, -5], k = 8

Output: nums = [1, 5, 3, -5, 3, 4]

Explanation:

rotate 1 step to the left: [4, 1, 5, 3, -5, 3]

rotate 2 steps to the left: [1, 5, 3, -5, 3, 4]

rotate 3 steps to the left: [5, 3, -5, 3, 4, 1]

rotate 4 steps to the left: [3, -5, 3, 4, 1, 5]

rotate 5 steps to the left: [-5, 3, 4, 1, 5, 3]

rotate 6 steps to the left: [3, 4, 1, 5, 3, -5]

rotate 7 steps to the left: [4, 1, 5, 3, -5, 3]

rotate 8 steps to the left: [1, 5, 3, -5, 3, 4]

Example 3

Input: nums = [1, 2, 3, 4, 5], k = 4

Output:

[5, 1, 2, 3, 4]
 */
import java.util.*;

class Solution {
    // Function to rotate the array to the left by k positions
    public void rotateArray(int[] nums, int k) {
        int n = nums.length; // Size of array
        k = k % n; // To avoid unnecessary rotations

        int[] temp = new int[k];

        // Store first k elements in a temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // Shift n-k elements of given array to the front
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        // Copy back the k elements at the end
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
}

class Main {
    // Helper function to print the array
    public static void printArray(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        System.out.println("Initial array: ");
        printArray(nums);

        // Create an instance of the Solution class
        Solution sol = new Solution();

        /* Function call to rotate the
        array to the left by k places */
        sol.rotateArray(nums, k);

        System.out.println("Array after rotating elements by " + k + " places: ");
        printArray(nums);
    }
}
