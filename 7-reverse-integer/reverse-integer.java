
class Solution {
    public int reverse(int x) {
        long reverse=0;
        
        while(x!=0){
            
            int r=x%10;
            reverse=reverse*10+r;
            x=x/10;
        }
        if(reverse>2147483647 || reverse < -2147483648L){
            return 0;
        }
        return (int)reverse;
        
    }
}
        
