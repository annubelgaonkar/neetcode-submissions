class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int s=0, e=numbers.length-1;
        while(s<e){
            int sum = numbers[s] + numbers[e];
            if(sum == target){
                ans[0] = s+1;
                ans[1] = e+1;
                return ans;
            }
            else if(sum > target){
                e--;
            }
            else s++;
        }
        return new int[0];
    }
}
