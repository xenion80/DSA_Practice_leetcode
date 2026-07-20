class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k=k%total;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            ans.add(row);

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int oldIn=i*n+j;
                int newIn=(oldIn+k)%total;

                int newRow=newIn/n;
                int newCol=newIn%n;
                ans.get(newRow).set(newCol,grid[i][j]);
            }
        }
        return ans;


    }
}