class Solution {
    public boolean isPowerOfThree(int n) {
        
      //Base Case
      if(n<=0){
        return false;
      }
      if(n==1){
        return true;
      }
      if(n%3 !=0){
        return false;
      }
      //Check for next divisor
      return isPowerOfThree(n/3);
    }
}