public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    for(int stone: stones)
        maxHeap.add(-stone);

    while(maxHeap.size() > 1){
        int one = -maxHeap.remove();
        int two = -maxHeap.remove();
        if(one != two)
            maxHeap.add(-(one - two));
       
    }
    return maxHeap.isEmpty()? 0: -maxHeap.remove();

}