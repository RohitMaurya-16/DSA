class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
       for(int i=0;i<nums.length;i++)
       {
           x^=nums[i];         
       }
       return x;
}
}

//  Check hint section where i you will have  to lean about xor and how it works then you will
//  easily be solve this question  

// Step 1: 4 ^ 1 = 5 (Binary: 100 ^ 001 = 101)       
// Step 2: 5 ^ 2 = 7 (Binary: 101 ^ 010 = 111)
// Step 3: 7 ^ 1 = 6 (Binary: 111 ^ 001 = 110)
// Step 4: 6 ^ 2 = 4 (Binary: 110 ^ 010 = 100)


// Xor same bit sum=0 and diffrent bit sum=1;

// Decimal	Binary
// 0	    0000
// 1	    0001
// 2	    0010
// 3	    0011
// 4	    0100
// 5	    0101
// 6	    0110
// 7	    0111
// 8	    1000
// 9	    1001