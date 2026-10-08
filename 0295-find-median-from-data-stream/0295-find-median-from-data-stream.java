class MedianFinder {
   
   Queue<Integer> leftHeap;
   Queue<Integer> rightHeap;
   
    public MedianFinder() {  
      
        leftHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);
        rightHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
    }
    
    public void addNum(int num) {

        leftHeap.add(num);
        rightHeap.add(leftHeap.poll());
        
        if(leftHeap.size()<rightHeap.size())
        {
            leftHeap.add(rightHeap.poll());
        }
        
    }
    
    public double findMedian() {


   if(leftHeap.size()>rightHeap.size())
   {
    return leftHeap.peek();
   }
        
       
            return (leftHeap.peek()+rightHeap.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */