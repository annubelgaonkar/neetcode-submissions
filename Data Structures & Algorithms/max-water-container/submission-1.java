class Solution {
    public int maxArea(int[] heights) {
        int s = 0, e = heights.length-1;
        int maxWater = 0;
        while(s < e){
            int ht = Math.min(heights[s], heights[e]);
            int wid = e - s;
            int currWater = wid * ht;
            maxWater = Math.max(maxWater, currWater);
            if(heights[s] < heights[e]){
                s++;
            }
            else e--;
        }
        return maxWater;
    }
}
