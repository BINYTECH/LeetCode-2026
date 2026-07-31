class Solution {
    public int Reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10) + rem;
            n=n/10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
         int rev=Reverse(x);
         if(x==rev){
            return true;
         }
         return false;
    }
}