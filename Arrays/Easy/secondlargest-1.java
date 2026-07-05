/*Intuition
To find the second largest element in an array, one simple way is to use sorting. By sorting the array in ascending order, the largest element will be surely at the last index, and the second largest element will be at the second-to-last index.
What if there are fewer than 2 elements in an array ?
There would not be any second largest element for this case, so returned value will be -1.

What if last and second last element turn out as same ?
If the second-to-last element is equal to the last element, continue checking the preceding elements until a different value is found. This approach guarantees that correct identification of the second largest element is made.
Approach 
Initialize 2 variables largest, and secondLargest. 
Initialize secondLargest to -1 as initially there shall be no second largest element.
Sort the array and update largest with last element of array.
Now iterate the array from second to last index and if the element is not equal to the largest , update secondLargest to that element and break out once secondLargest is updated.
 Return the value stored in secondLargest */
 //brute force
 package Arrays.Easy;
 import java.util.*;
class Solution {
    public int secondLargestElement(int[] nums) {
        if(nums.length<2) return -1;
   Arrays.sort(nums);
   int first=nums[nums.length-1];
   for(int i=nums.length-1;i>=0;i--){
   if(nums[i]!=first)
         return nums[i];
   } 
return -1;
    }
}