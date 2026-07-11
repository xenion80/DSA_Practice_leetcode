class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0)return"";
        Map<Character,Integer> need=new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
         Map<Character,Integer> window=new HashMap<>();
         int left=0,right=0,minLength=Integer.MAX_VALUE,required=need.size(),formed=0,start=0;
         for(right=0;right<s.length();right++){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c)&&window.get(c).intValue()==need.get(c).intValue()){
                formed++;
            }
            while(formed==required){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    start=left;
                }
                char remove=s.charAt(left);
                window.put(remove,window.getOrDefault(remove,0)-1);

               if (need.containsKey(remove) &&
                    window.get(remove) < need.get(remove)) {
                    formed--;
                }
                left++;


            }
         }
         if(minLength==Integer.MAX_VALUE)return "";
         return s.substring(start,start+minLength);

        
    }
}