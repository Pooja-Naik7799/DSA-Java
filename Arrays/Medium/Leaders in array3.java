package Arrays.Medium;
import java.util.*;
class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        int n=nums.length-1;
        for(int i=n;i>=0;i--){
            if(nums[i]>maxi){
                list.add(nums[i]);
                maxi=nums[i];
            }
        }
        Collections.reverse(list);  // using inbuli methood
       return  list;
    }
}
