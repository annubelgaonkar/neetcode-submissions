class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 0;
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i-1]);
        }

        right[n-1] = 0;
        for(int j=n-2; j>=0; j--){
            right[j] = Math.max(right[j+1], height[j+1]);
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            int l = left[i];
            int r = right[i];
            int water = Math.min(l,r) - height[i];
            if(water > 0){
                ans += water;
            }
        }
        return ans;
    }
}
