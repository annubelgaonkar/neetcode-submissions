class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int right=1;
        int s=0; int e = nums.length-1;
        int ans = 0;
        if(nums.length==1 && nums[0] < 0){
            return nums[0];
        }
        while(s<nums.length && e>=0){
            if(left==0)     left=1;
            if(right==0)    right=1;
            left=left*nums[s];
            right=right*nums[e];
            s++;
            e--;
            ans = Math.max(ans, Math.max(left, right));
        }
        return ans;
    }
}
