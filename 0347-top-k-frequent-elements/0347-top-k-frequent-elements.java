class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int x:nums)
        {
            map.merge(x,1,Integer::sum);
        }
      for(Map.Entry<Integer,Integer> entry: map.entrySet())
      {
        pq.offer(new int[]{entry.getKey(),entry.getValue()});
      }

      int arr[]= new int[k];

      for(int i=0;i<k;i++)
      {
        arr[i]=pq.poll()[0];
      }

      return arr;
    }
}