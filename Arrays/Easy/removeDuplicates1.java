package Arrays.Easy;
/*Remove duplicates from sorted array
Easy

Hints
Company
Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.



Return the number of unique elements in the array.



If the number of unique elements be k, then,

Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
The remaining elements, as well as the size of the array does not matter in terms of correctness.
The driver code will assess correctness by printing and checking only the first k elements of the modified array.


An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.


Example 1

Input: nums = [0, 0, 3, 3, 5, 6]

Output: 4

Explanation:

Resulting array = [0, 3, 5, 6, _, _]

There are 4 distinct elements in nums and the elements marked as _ can have any value.

Example 2

Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]

Output: 4

Explanation:

Resulting array = [-2, 2, 4, 5, _, _, _, _]

There are 4 distinct elements in nums and the elements marked as _ can have any value. */
import java.util.*;

class Solution {
    // Function to remove duplicates from the array
    public int removeDuplicates(int[] nums) {
        
        // TreeSet to store unique elements in sorted order
        Set<Integer> s = new TreeSet<>();
        
        // Add all elements from array to the set
        for (int val : nums) {
            s.add(val);
        }
        
        // Get the number of unique elements
        int k = s.size();
        
        int j = 0;
        // Copy unique elements from set to array
        for (int val : s) {
            nums[j++] = val;
        }
        
        // Return the number of unique elements
        return k;
    }
}

class Main {
    // Helper function to print first n elements of the array
    public static void printArray(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};
        
        System.out.print("Original Array: ");
        printArray(nums, nums.length);
        
        // Create an instance of the Solution class
        Solution sol = new Solution();
        
        // Function call to remove duplicates from array
        int k = sol.removeDuplicates(nums);
        
        System.out.print("Array after removing the duplicates: ");
        printArray(nums, k);
    }
}
