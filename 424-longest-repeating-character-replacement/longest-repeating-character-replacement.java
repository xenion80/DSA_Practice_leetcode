class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> freq=new HashMap<>();
        int low=0,n=s.length(),res=Integer.MIN_VALUE;
        for(int high=0;high<n;high++){
            freq.put(s.charAt(high),freq.getOrDefault(s.charAt(high),0)+1);
            int len=high-low+1;
            int maxcnt=Collections.max(freq.values());
            int diff=len-maxcnt;
            while(diff>k){
            freq.put(s.charAt(low),freq.getOrDefault(s.charAt(low),0)-1);
            low++;
            len=high-low+1;
            maxcnt=Collections.max(freq.values());
            diff=len-maxcnt;

            }
            len=high-low+1;
            res=Math.max(res,len);

        }
        return res;
        
    }
}