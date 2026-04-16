class Solution {
    public int []nextsmallestindexonleft(int A[], int n){
       
        int []left = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            while(st.size()>0 && A[i] <= A[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                left[i] = -1;
            }
            else{
                left[i] = st.peek();
            }
            st.push(i);
        }
        return left;
    }

    public int[] nextsmallestindexonright(int A[], int n){

         int []right = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(st.size()>0 && A[i] <= A[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                right[i] = n;
            }
            else{
                right[i] = st.peek();
            }
            st.push(i);
        }
        return right;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = nextsmallestindexonleft(heights,n);
        int right[] = nextsmallestindexonright(heights,n);

        int maxArea=0;

        for(int i=0; i<n; i++){
            int l = left[i];
            int r = right[i];
            int width = r-l-1;
            maxArea = Math.max(maxArea, width*heights[i]);
        }
        return maxArea;
    }
}
