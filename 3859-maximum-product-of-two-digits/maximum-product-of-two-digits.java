class Solution {
    public int maxProduct(int n) {
        int rem=0;
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        while(n!=0){
            rem=n%10;
            if(rem>firstMax){
                secondMax=firstMax;
                firstMax=rem;
                

            }
             else if (rem > secondMax){
                secondMax=rem;
             }
            
           
            n/=10;




        }
        return firstMax*secondMax;
        
    }
}