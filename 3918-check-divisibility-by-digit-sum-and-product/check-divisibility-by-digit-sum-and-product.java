class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1,temp=n;
        while(temp!=0){
            int rem=temp%10;
            sum+=rem;
            product*=rem;
            temp/=10;

        }
        return(n%(sum+product)==0);
        
    }
}