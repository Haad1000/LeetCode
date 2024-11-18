class MinStack {
    ArrayList<Integer> minStack = new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();

    public MinStack() {
    }
    
    public void push(int val) {
        list.add(val);
        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }
    }
    
    public void pop() {
        int len = list.size();
        int val = list.get(len - 1);
        list.remove(len - 1);
        if (val == minStack.get(minStack.size() - 1)) {
            minStack.remove(minStack.size() - 1);
        }
    }
    
    public int top() {
        int len = list.size();
        int val = list.get(len - 1);
        return val;
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */