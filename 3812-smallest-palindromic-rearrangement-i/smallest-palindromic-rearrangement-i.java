class Solution {
    public String smallestPalindrome(String s) {
        int[] f = new int[26]; 
        int n = s.length();  
        for(int i = 0; i < n; i++) f[s.charAt(i) -'a']++; 
        char[] str = new char[n]; 
        int st = 0, en = n - 1; 
        for(int i = 0; i < 26; i++) {
            char c = (char)(i + 'a'); 
            while(f[i] >= 2) {
                str[st++] = c; 
                str[en--] = c; 
                f[i] -= 2; 
            }
            if(f[i] == 1) str[n /2] = c; 
        }
        return String.valueOf(str); 
    }
}