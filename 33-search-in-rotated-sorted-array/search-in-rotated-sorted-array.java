class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        int idx=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target) return mid;
            if(nums[lo]<=nums[mid] ){
                // that means left wala part sorted hai
                if(target>=nums[lo] && target<=nums[mid]){
                    hi=mid-1;
                }
                else{
                    // go right
                    lo=mid+1;
                }
            }
            else{
                // that means left wala part sorted nhi hai(righ wala hai)
                 if(target>=nums[mid] && target<=nums[hi]){
                    // go right
                    lo=mid+1;
                 }
    
                else{
                    // go left
                    hi=mid-1;
                }

            }
            }
            return -1;
        }
        
    }