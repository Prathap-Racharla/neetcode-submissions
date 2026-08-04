class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count[]=new int[nums[nums.length-1]+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                return i;
            }
        }
        return -1;
    }
}
