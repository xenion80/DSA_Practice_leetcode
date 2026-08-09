
// Game Strategy & Dynamic Programming
// Alice -> 1 , Bob -> 0

class Solution {

    int dp[][][];

    public int stoneGameII(int[] piles) {
        int n=piles.length;
         // person = 0/1, i = n, M = n
        dp = new int[2][n][n + 1];

        // -1 means state has not been calculated yet
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < n; i++) {
                for (int m = 0; m <= n; m++) {
                    dp[p][i][m] = -1;
                }
            }
        }

        return solveForAlice(piles,1,0,1);
    }


    private int solveForAlice(int piles[],int person,int i,int M){
        
        if(i >= piles.length) return 0;

        // Already calculated
        if (dp[person][i][M] != -1) {
            return dp[person][i][M];
        }

        int result=(person==1) ? -1 : Integer.MAX_VALUE;
        int stones=0;

        for(int x=1;x <= Math.min(2*M, piles.length-i);x++){
            stones += piles[i+x-1];

            if(person == 1){ // Alice wants to maximize her stones
                result = Math.max(result, stones+solveForAlice(piles,0,i+x,Math.max(M,x)));
            }
            else{ // Bob wants to minimize Alice's stones
                result = Math.min(result, solveForAlice(piles,1,i+x,Math.max(M,x)));
            }
        }
        return dp[person][i][M] = result;
    }

}