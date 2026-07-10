class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=0,zeros=0,low=0;
        for(int high=0;high<nums.length;high++){
            
            if(nums[high]==0)zeros++;
            while(zeros>k){
                if(nums[low]==0)zeros--;
                low++;

            }
            len=Math.max(len,high-low+1);

        }
        return len;
    }
}