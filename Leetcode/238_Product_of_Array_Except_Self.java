class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // prefix = new int[nums.length],
        // postfix = new int[nums.length];
         

        // Arrays.fill(prefix, 1);
        // Arrays.fill(postfix, 1);
        Arrays.fill(result, 1);

        int i, pref=1, post=1;
        for(i=1; i<nums.length; i++) {
            pref *= nums[i-1];
            result[i] = pref;
        }
        for(i=nums.length-2; i>=0; i--) {
            post *= nums[i+1];
            result[i] *= post;
        }
        // System.out.println("prefix " + Arrays.toString(prefix) + " post " + Arrays.toString(postfix));
        // for(i=0; i<nums.length; i++)
        //     result[i] = prefix[i] * postfix[i];

         return result;   
    }
}
