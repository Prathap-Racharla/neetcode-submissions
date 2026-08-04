class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
        int count=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
                if(count>0) return true;
        }
        return false;
    }
}