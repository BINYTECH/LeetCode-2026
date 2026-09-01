class Solution {
    public boolean isPowerOfFour(int n) {
          //Base Case
      if(n<=0){
        return false;
      }
      if(n==1){
        return true;
      }
      if(n%4 !=0){
        return false;
      }
      //Check for next divisor
      return isPowerOfFour(n/4);
    }
}