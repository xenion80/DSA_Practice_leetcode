class Solution {
    public int uniqueXorTriplets(int[] nums) {

        boolean[][] dp = new boolean[4][2048];
        dp[0][0] = true;

        for (int taken = 0; taken < 3; taken++) {
            for (int xor = 0; xor < 2048; xor++) {
                if (!dp[taken][xor]) continue;

                for (int value : nums) {
                    dp[taken + 1][xor ^ value] = true;
                }
            }
        }

        int ans = 0;
        for (boolean b : dp[3]) {
            if (b) ans++;
        }

        return ans;
    }
}