class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxar=Integer.MIN_VALUE;
        int n=heights.length;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            int currentheight=(i==n)?0:heights[i];
            while(!stk.isEmpty()&&heights[stk.peek()]>currentheight){
                int element=heights[stk.pop()];
                int left=stk.isEmpty()?-1:stk.peek();
                int right=i;
                int width=right-left-1;
                maxar=Math.max(maxar,element*width);
            }
           stk.push(i);
           
        }
        while(!stk.isEmpty()){
            int element=heights[stk.pop()];
            int right=n;
            int left=stk.isEmpty()?-1:stk.peek();
            int width=right-left-1;
            maxar=Math.max(maxar,element*width);

           }
        return maxar;
        
    }
}