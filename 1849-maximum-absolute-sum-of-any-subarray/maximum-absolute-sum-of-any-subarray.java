class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnd=0,minEnd=0,result=0;
        int maxSum=Integer.MIN_VALUE,minSum=Integer.MAX_VALUE;
        for(int x: nums){
            maxEnd=Math.max(x,maxEnd+x);
            maxSum=Math.max(maxSum,maxEnd);

            minEnd=Math.min(x,minEnd+x);
            minSum=Math.min(minSum,minEnd);


            



        }
        result=Math.max(Math.abs(maxSum),Math.abs(minSum));
        return result;
        
    }
}