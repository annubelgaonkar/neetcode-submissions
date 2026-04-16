class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0] = 0;
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i-1]);
        }
        rightmax[n-1] = 0;
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i+1]);
        }
        int maxwater=0;
        for(int i=0; i<n; i++){
            int l = leftmax[i];
            int r = rightmax[i];
            int water = Math.min(l,r) - height[i];
            if(water>0){
                maxwater+=water;
            }
        }
        return maxwater;
    }
}
