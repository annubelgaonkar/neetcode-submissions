class Solution {
    public int longestConsecutive(int[] nums) {
        //brute force
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int len = 0, currNum=nums[i];        
            while(set.contains(currNum)){
                len++;
                currNum++;
            }
            ans = Math.max(ans, len);
        }
        return ans;
    }
}
