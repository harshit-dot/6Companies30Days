
 class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long ugly[] = new long[n];
        int i2 = 0, i3 = 0, i5 = 0;
        long n2 = 2;
        long n3 = 3;
        long n5 = 5;
        long next = 1;
 
        ugly[0] = 1;
 
        for (int i = 1; i < n; i++)
        {
            next
                = Math.min(n2,
                           Math.min(n3,
                                    n5));
 
            ugly[i] = next;
            if (next == n2)
            {
                i2 = i2 + 1;
                n2 = ugly[i2] * 2;
            }
            if (next == n3)
            {
                i3 = i3 + 1;
                n3 = ugly[i3] * 3;
            }
            if (next == n5)
            {
                i5 = i5 + 1;
                n5 = ugly[i5] * 5;
            }
        }
         
        return next; 
        
    }
}