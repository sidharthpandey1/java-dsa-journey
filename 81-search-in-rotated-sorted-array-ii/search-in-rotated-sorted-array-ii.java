class Solution {
    public boolean search(int[] nums, int target) {
        int lo=0;
        int n=nums.length;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]==nums[lo]){
                lo=lo+1;
                continue;
            }
            if(nums[lo]<=nums[mid]){
                // left part soted hai
                if(target>=nums[lo] && target<=nums[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                // right wala sorted hai
                if(target>=nums[mid] && target<=nums[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return false;
        
    }
}