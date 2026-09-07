class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        //DP Sum hashmap to store the sum 
        //Base Case: we start with sum 0 and only 1 way to achieve it is not picking any element
        Map<Integer, Integer> Dp= new HashMap<>();
        Dp.put(0,1);

        //Running a loop through all the elements of array and slecting two option of + and - for previous sum
        for(int num : nums){
            //Temporary Map to store the previous sum ways
            Map<Integer,Integer> nextDp=new HashMap<>();

            //For every possible sum in Dp, add and subtract the current number
            for(int sum:Dp.keySet()){
                int count=Dp.get(sum);

                //Add current number to sum
                nextDp.put(sum+num, nextDp.getOrDefault(sum+num,0)+count);
                //subtract current number to sum
                nextDp.put(sum-num, nextDp.getOrDefault(sum-num,0)+count);
            }
            //While moving to next element update the Dp for next iteration
            Dp=nextDp;
        }
        
        return Dp.getOrDefault(target,0);
    }
}