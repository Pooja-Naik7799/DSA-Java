package Arrays.Easy;

//optimal approach
class Solution {
    public int secondLargestElement(int[] nums) {
        if(nums.length<2) 
        return -1;
   
    int secondLargest=Integer.MIN_VALUE;
    int firstLargest=nums[0];
    for(int i=0;i<nums.length;i++){
        if(nums[i]>firstLargest && nums[i]!=firstLargest){
              secondLargest=firstLargest;
            firstLargest=nums[i];

          
        }
        else if(nums[i]<firstLargest && nums[i]>secondLargest){
            secondLargest=nums[i];
        }
    }
    return (secondLargest==Integer.MIN_VALUE) ? -1 : secondLargest; 
    }
}
