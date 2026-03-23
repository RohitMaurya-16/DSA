class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       // Initialize the dynamic list
List<int[]> list = new ArrayList<>();
Arrays.sort(nums); // Sort to group identical numbers

for (int i = 0; i < nums.length; i++) {
    int count = 1;
    // Jump through duplicates
    while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
        count++;
        i++;
    }
    // Store pair: [the number, its count]
    list.add(new int[]{nums[i], count});
}

list.sort((a,b)->b[1]-a[1]);

int[] x=new int[k];
for(int i=0;i<k;i++)
{
x[i]=list.get(i)[0];
}

return x;
    }
}