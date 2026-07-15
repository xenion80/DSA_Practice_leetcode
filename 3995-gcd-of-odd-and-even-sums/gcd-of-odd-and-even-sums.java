class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=1;i<n+1;i++){
            sumOdd+=2*i-1;
            sumEven+=2*i;
        }
        while(sumEven!=0){
            int temp=sumEven;
            sumEven=sumOdd%sumEven;
            sumOdd=temp;
        }
        return sumOdd;
        
    }
}