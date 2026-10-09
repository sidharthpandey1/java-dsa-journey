import java.util.*;

        class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            // string ke har ak element ko nikala aur c me dala
            char c = s.charAt(right);
            // check kiya ki kya wo element pahle se hi map me present hai ya nhi agar present hai to left wale index ko aage badhaya
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            // agar prsnt nhi hai to usko map me add kiya 
            map.put(c,right);
            maxLen=Math.max(maxLen,right-left+1);

        } 
        return maxLen;   
    }
}
        
        
               