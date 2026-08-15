class Solution {
    public int longestSubsequence(int[] nums) {
        int result=0;
        boolean flag=false;
        for(int num: nums){
            result^=num;
            if(result!=0)flag=true;




        }
        if(result!=0)return nums.length;

        return flag?nums.length-1:0;
        
    }
}