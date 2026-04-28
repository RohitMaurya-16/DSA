class Solution {

    public int minEatingSpeed(int[] piles, int h) 
    {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile); // Fixed: high = Math.max(high, pile)
        } 
        
        // as per case 1 you will have 11
        int result = high;     // 11
        
        while (low <= high)
        {
            int mid = low + (high - low) / 2;    // 6 ---> Each time we will assume min time is mid okk..

            if (finish(piles, mid, h))
            {
                result = mid;
                high = mid - 1;  // if true it may mid-1 also can finsih with in h hours i need to find min....
            }
            else
            {
                low = mid + 1;
            }
        }
        return result;
    }

    public boolean finish(int[] piles, int mid, int h)
    {  
        long time = 0;

        for (int pile : piles)
        {
            time += (pile + mid - 1) / mid; // in ceil function we get roundup value ex: 1.2-->2 0.1-->1 like this
            //time+=(long)Math.ceil((double)pile/mid);  //  This line increase the time to  compile
            if (time > h) return false;
        }

        return true;
    }
}