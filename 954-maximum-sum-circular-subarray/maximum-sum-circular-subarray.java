class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count=0;
        int sum=0,maxSum=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sum=Math.min(sum+nums[i],nums[i]);
            min=Math.min(sum,min);

            maxSum=Math.max(maxSum+nums[i],nums[i]);
            max=Math.max(max,maxSum);
        }
        if(max<0)return max;
        
        return Math.max(max,count-min);
    }
}