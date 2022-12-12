public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int numOnes = 0;
        while(n != 0) {
            numOnes += (n & 1);
            n >>>= 1;
        }

        return numOnes;
    }
}
