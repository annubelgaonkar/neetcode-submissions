class Solution {
    public int longestConsecutive(int[] nums) {
        //brute force
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for(int num : nums){
            int count = 0, currNum = num;
            while(set.contains(currNum)){
                count++;
                currNum++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
