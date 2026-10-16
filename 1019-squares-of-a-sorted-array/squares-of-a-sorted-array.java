class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int left=0;
        int right=n-1;
        int i=n-1;
        while(left<=right){
            int leftsquare=nums[left]*nums[left];
            int rightsquare=nums[right]*nums[right];
            if(leftsquare>rightsquare){
                ans[i]=leftsquare;
                left++;
            }
            else{
                ans[i]=rightsquare;
                right--;
            }
            i--;
        }
        return ans;
        
    }
}