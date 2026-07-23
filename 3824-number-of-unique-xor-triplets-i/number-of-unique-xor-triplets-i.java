class Solution {
   public int uniqueXorTriplets(int[] nums) {
   int n=nums.length;
    if(nums.length<=2)return n;
   int bitLength = Integer.SIZE - Integer.numberOfLeadingZeros(n);
   return 1 << bitLength;
        
    }
}