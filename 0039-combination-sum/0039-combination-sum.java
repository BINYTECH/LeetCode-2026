class Solution {
    public void findCombination(int index, int []arr, int target,List<List<Integer>>ans, List<Integer> ds){
          //Base Case - When ds storing the elements met the target then store this in ans list
          if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList(ds));
            }
            return;  //if target is greater than 0 then return from the func call
          }

          //Picking up the same element till target is met
          if(arr[index]<=target){
            ds.add(arr[index]);
            findCombination(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1); //Removing the element while reverting back if target is not met
          }

          findCombination(index+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}