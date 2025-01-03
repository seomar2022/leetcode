//https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answere = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            int pair = target - nums[i];
            
            for (int j = i+1; j < nums.length; j++){
                if(pair == nums[j]){
                    answere[0]=i;
                    answere[1]=j;
                    break;
                }
            }
            
        }
        return answere;
    }
}