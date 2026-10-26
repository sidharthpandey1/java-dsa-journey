class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int top1=pq.remove();
            int top2=pq.remove();
            if(top1!=top2){
                pq.add(top1-top2);
            }
        }
        if(pq.isEmpty()) return 0;
        else{
            return pq.peek();
        }


        
    }
}