package Arrays.Easy;

class Solution {
    public void moveZeroes(int[] nums) {
        // j keeps track of where the next non-zero should be placed
        int j = 0;

        // Loop through all elements
        for (int i = 0; i < nums.length; i++) {
            // If current element is non-zero
            if (nums[i] != 0) {
                // Swap current element with the one at index j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move j forward
                j++;
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        // Create Solution instance and move zeroes
        Solution sol = new Solution();
        sol.moveZeroes(arr);

        // Print updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

