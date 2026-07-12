class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ar=arr.clone();
        Arrays.sort(ar);
        Map<Integer,Integer> record=new HashMap<>();
        int currentrank=1;
        for(int i=0;i<arr.length;i++){
            if(!record.containsKey(ar[i])){
                record.put(ar[i],currentrank);
                currentrank++;
            }
            
        }
        int[] rank=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            rank[i]=record.get(arr[i]).intValue();
        }
        return rank;
        
    }
}