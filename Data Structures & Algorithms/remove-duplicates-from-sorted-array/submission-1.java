class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int left=1;

        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                int temp=nums[i];
                nums[left]=nums[i+1];
                left++;
            }
        }
        return left;
    }
}