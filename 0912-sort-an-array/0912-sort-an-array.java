class Solution {
    public int[] sortArray(int[] nums) {
        int low=0;
        int high=nums.length-1;

        quicksort(nums,low,high);
        return nums;
    }
        public void quicksort(int[] nums, int low, int high)
        {
            if(low<high)
        {
            int par=partition(nums, low,high);
            quicksort(nums,low,par-1);
            quicksort(nums, par+1,high);
        }
        }


    public int partition(int[] arr, int low,int high)
    {
        Random rand = new Random();

        int randomIndex = low + rand.nextInt(high - low + 1);

        swap(arr, randomIndex, high);
        int p=arr[high];
        int i=low-1;

        for(int j=i+1;j<high;j++)
        {
            if(arr[j]<p)
            {
             i++;
             swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;

    }

    private void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}