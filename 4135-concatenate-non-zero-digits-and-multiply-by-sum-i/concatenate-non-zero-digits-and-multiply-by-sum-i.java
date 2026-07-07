class Solution {
    public long sumAndMultiply(int n) {
        long con=0,sum=0,j=0;
        while(n>0){
            long rem=n%10;
            if(rem==0){
                n = n / 10;
                
                continue;}
            sum+=rem;
            con+=(long)(rem*Math.pow(10,j++));
            n=n/10;
            
        }
        return con*sum;
        
    }
}