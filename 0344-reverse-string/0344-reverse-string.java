class Solution {
    public void Swap(char[] s, int start, int end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
    }
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        int mid=start+(end-start)/2;

        while(start<=mid){
             Swap(s,start,end);
             start++;
             end--;
        }
    }
}