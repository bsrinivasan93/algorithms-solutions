class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> indexMap = new HashMap();
        for(int i=0; i<nums.length; i++) {
            int num = nums[i],
                    diff = target - num;
            if(indexMap.containsKey(diff)) {
                res[0] = i;
                res[1] = indexMap.get(diff);
                break;
            }
            indexMap.put(num, i);
        }
        return res;
    }
}