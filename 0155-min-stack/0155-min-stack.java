class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> stackCopy = (Stack<Integer>) stack.clone();
        int min;
        if (stackCopy.size() > 0) {
            min = stackCopy.pop();
        } else {
            return 0;
        }
        while (stackCopy.size() > 0) {
            if (stackCopy.peek() < min) {
                min = stackCopy.pop();
            }
            else {
                stackCopy.pop();
            }
        }

        return min;
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