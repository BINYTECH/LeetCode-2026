class Solution {
    public int search(int[] nums, int target) {
        return Rec_Binary_Search(nums,target,0,nums.length-1);
    }
    public int Rec_Binary_Search(int arr[], int target, int start, int end){
        int mid=start+(end-start)/2;
       //Terminating Condition if element not found
        if(start>end){
            return -1;
        }

        //Base Condition
        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
            return Rec_Binary_Search(arr,target,start,mid-1);
        }
        return Rec_Binary_Search(arr,target,mid+1,end);
    }
}