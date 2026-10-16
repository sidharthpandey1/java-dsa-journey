class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[n-2]-1;
        int b=nums[n-1]-1;
        int ans=a*b;
        return ans;
        
    }
}