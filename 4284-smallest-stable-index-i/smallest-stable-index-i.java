class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int res=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            int min=Integer.MAX_VALUE;
            
            max=Math.max(max,nums[i]);
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);

            }
            res=max-min;
            if(res<=k)return i;

        }
        return -1;
        
    }
}