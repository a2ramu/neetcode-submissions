class Solution {
    public boolean hasDuplicate(int[] nums) {
        int numsLength = nums.length;
        for(int i = 0; i < numsLength; i ++){
            for(int j = i+1; j < numsLength; j++){
                if(nums[i] == nums[j]){
                    System.out.println("j::"+j);
                    System.out.println("i::"+i);
                    return true;
                }    
            }          
        }
        return false;
    }
}