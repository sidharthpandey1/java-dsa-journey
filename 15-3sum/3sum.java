import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
             if(i>0 && nums[i]==nums[i-1]){
                continue;
             }
           while(left<right){
            if(nums[i]+nums[left]+nums[right]==0){
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                // skip duplicate left value
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                // skip right duplicates value
                while(left<right && nums[right]==nums[right+1]){
                    right--;
                }
            }
            else if(nums[i]+nums[left]+nums[right]<0){
                left++;
            }
            else{
                right--;
            }

           }   
        }
        return ans;

    }    
}