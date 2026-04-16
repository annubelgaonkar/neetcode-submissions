class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int len = 0;
            if(set.contains(nums[i])){
                len++;
                while(set.contains(nums[i] + len)){
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
}
