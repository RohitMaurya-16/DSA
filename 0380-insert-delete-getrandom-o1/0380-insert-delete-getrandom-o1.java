class RandomizedSet {
    List<Integer> arr;
    Map<Integer,Integer> numToIndex;
    Random rand;
    public RandomizedSet() {
        this.arr=new ArrayList<>();  
        this.numToIndex=new HashMap<>();
        this.rand=new Random();
    }
    
    public boolean insert(int val) {
        if(numToIndex.containsKey(val)) return false;
        arr.add(val);
        numToIndex.put(val,arr.size()-1);
        return true;   
    }
    
    public boolean remove(int val) {
        Integer index=numToIndex.get(val);
        if(index==null) return false;
        int size=arr.size();
        
        if(index==size-1){
            arr.remove(size-1);
        }else{
            int last=arr.get(size-1);
            arr.remove(size-1);
            arr.set(index,last);
            numToIndex.put(last,index);
        }
        numToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
}