class Solution {
    public void rotate(int[] nums, int k) {
        int p=nums.length;
        k=k%p;
        reverse(nums,0,p-1);
        reverse(nums,0,k-1);
        reverse(nums,k,p-1);
    }
    public void reverse(int[] nums,int i,int j){
        int n=nums.length;
        //int i=0;
        //int j=n-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
    }
}