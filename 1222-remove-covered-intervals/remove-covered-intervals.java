class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0] ? Integer.compare(b[0],a[1]) : Integer.compare(a[0],b[0]));
        int prev = -1;
        int count = 0;

        for(int[] interval : intervals){
            if(prev>=interval[1]){
                count++;
            }
            else{
                prev = interval[1];
            }
        }


        return intervals.length - count;
    }
}