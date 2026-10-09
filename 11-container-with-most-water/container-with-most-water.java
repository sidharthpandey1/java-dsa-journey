class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int area=0;
        int maxarea=0;
        while(i<j){
            if(height[i]<height[j]){
                area=Math.min(height[i],height[j])*(j-i);
                i++;

            }
            else{
                area=Math.min(height[i],height[j])*(j-i);
                j--;
            }
            // find max from areas
            if(area>maxarea){
                maxarea=area;
            }
            

        }
        
            
        return maxarea;
        
    }
}