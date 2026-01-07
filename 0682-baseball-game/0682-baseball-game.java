class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String x : operations) {
            if (x.equals("+")) {
                stack.push(stack.peek() + stack.get(stack.size() - 2));
            } else if (x.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (x.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(x));
            }
        }

        int returnValue = 0;

        while (stack.size() > 0) {
            returnValue += stack.pop();
        }

        return returnValue;
    }
}