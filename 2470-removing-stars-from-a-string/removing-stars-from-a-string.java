class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*') st.pop();
            else st.push(ch);  
        }
        //kyuki answer string type ka hona chahiye
        String ans="";
        while(!st.isEmpty()){
            //because stack me answer reverse order me jaa rhe hai so 
            ans=st.pop()+ans;
        }
        return ans;
        
    }
}