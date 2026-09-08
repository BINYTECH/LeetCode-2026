class Solution {
    public String getInvertedRev(String sb){
        StringBuilder result=new StringBuilder();

        //Invert the bits while traversing backward to automatically reverse the string
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='0'){
                result.append('1');
            }else{
                result.append('0');
            }
        }
        return result.toString();
    }
    public char findKthBit(int n, int k) {
       StringBuilder currentString=new StringBuilder("0");

       for(int i=2;i<=n;i++){
        String invertedRev=getInvertedRev(currentString.toString());

        //Si - 1 + "1" + reverse(invert(Si - 1)
        currentString.append("1").append(invertedRev);
       }
       return currentString.charAt(k-1);
    }
}