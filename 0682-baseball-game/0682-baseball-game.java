class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();

        for (String ops : operations) {
            if (ops.equals("+")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y);
                stack.push(x);
                stack.push(x + y);
            }
            else if (ops.equals("D")) {
                int d = stack.pop();
                stack.push(d);
                stack.push(d * 2);
            }
            else if (ops.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(ops));
            }
        }
        int output = 0;
        while (!stack.isEmpty()) {
            output += stack.pop();
        }

        return output;
    }
}