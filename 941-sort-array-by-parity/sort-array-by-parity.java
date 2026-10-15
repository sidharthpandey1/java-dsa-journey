class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
        // left pointer ko even milne tak aage badhao
        while(low<high && nums[low]%2==0){
            low++;

        }
        // right pointer ko odd milne tak peeche lao
        while(low<high && nums[high]%2!=0){
            high--;

        }
        if(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
        return nums;
       

        
    }
}