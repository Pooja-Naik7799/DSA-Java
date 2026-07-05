package Arrays.Easy;

/*Intersection of two sorted arrays
Easy

Hints
Company
Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays. Each element in the result must appear as many times as it appears in both arrays; that is, if an element appears x times in nums1 and y times in nums2, it should appear min(x, y) times in the result.



The intersection of two arrays is an array where all values are present in both arrays.


Example 1

Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]

Output: [1, 2]

Explanation:

The elements 1, 2 are the only elements present in both nums1 and nums2

Example 2

Input: nums1 = [1, 2, 2, 3, 3, 3], nums2 = [2, 3, 3, 4, 5, 7]

Output: [2, 3, 3]

Explanation:

The element 2 appears in both arrays only one time.

The element 3 appears in both arrays two times so we add element 3 equal to its number of occurrences. */
import java.util.*;

class Solution {
    //Function to find intersection of two sorted arrays
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> ansList = new ArrayList<>();
        int[] visited = new int[nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                /*If nums1[i] is equal to nums2[j] and nums2[j] 
                is not visited then add nums2[j] in ans.*/
                if (nums1[i] == nums2[j] && visited[j] == 0) {
                    
                    ansList.add(nums2[j]);
                    // Mark as visited
                    visited[j] = 1;
                    
                    break;
                } 
                 //If nums2[j] is greater than nums1[i], break out of loop
                else if (nums2[j] > nums1[i]) 
                    break; 
            }
        }

        // Convert ArrayList to int array
        int[] ans = new int[ansList.size()];
        for (int k = 0; k < ansList.size(); k++) {
            ans[k] = ansList.get(k);
        }
       
       //Return the final ans
        return ans;
    }
}
