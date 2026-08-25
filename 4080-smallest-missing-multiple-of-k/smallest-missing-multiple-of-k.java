class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> elements=new HashSet<>();
        for(int num: nums){
            elements.add(num);
        }
        int cur=k;
        while(elements.contains(cur)){
            cur+=k;
        }
        return cur;
        
    }
}