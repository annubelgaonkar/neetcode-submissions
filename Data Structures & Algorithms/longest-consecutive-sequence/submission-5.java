class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans=0;
        for(int i=0; i<nums.length; i++){
            int currNum=nums[i];
            int count=0;
            while(set.contains(currNum)){
                count++;
                currNum++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
