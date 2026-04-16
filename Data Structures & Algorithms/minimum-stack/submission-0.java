class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;
    
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        
       
        if(minSt.size() == 0){
            minSt.push(val);
        }
        else if(minSt.peek() >= val){
            minSt.push(val);
        }
    }
    
    public void pop() {
        int poppedVal = 0;
        if(st.size() > 0){
             poppedVal = st.pop();
        }
        
        if(poppedVal == minSt.peek()){
            minSt.pop();
        }
    }
    
    public int top() {
        if(st.size() > 0){
            return st.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if(minSt.size() > 0){
            return minSt.peek();
        }
        return 0;
    }
}
