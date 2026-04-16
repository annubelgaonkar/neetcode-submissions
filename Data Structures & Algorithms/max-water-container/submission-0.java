class Solution {
    public int maxArea(int[] heights) {
        int s=0;
        int e=heights.length-1;
        int maxwater=0;
        while(s<e){
            int width = e-s;
            int ht = Math.min(heights[e], heights[s]);
            int water = ht * width;
            maxwater = Math.max(maxwater, water); 
            if(heights[s] > heights[e]){
                e--;
            }
            else s++;
        }
        return maxwater;
    }
}
