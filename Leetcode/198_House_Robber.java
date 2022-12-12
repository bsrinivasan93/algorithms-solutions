class Solution {
    public int rob(int[] nums) {
        int rob1=0, rob2=0, temp;
        for(int n: nums) {
            temp = Math.max(n+rob2, rob1);
            rob2 = rob1;
            rob1 = temp;
        }
        return rob1;
    }
}
