class Solution {
    int solve(String s,int i ,int n)
    {
        if(i>=n/2)return 1;
        
        if(s.charAt(i)!=s.charAt(n-i-1))    return 0;
        
        return solve(s,i+1,n);
        
    }
    int isPalindrome(String S) {
        // code here
        
        int n = S.length();
        
        int ans = solve(S,0,n);
        return ans;
        
    }
};
