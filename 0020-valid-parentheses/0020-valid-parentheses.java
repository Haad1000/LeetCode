class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        int x = s.length() - 1;
        int numCurve = 0;
        int numCurl = 0;
        int numBar = 0;
        Stack<Character> order = new Stack<>();

        while (x > -1) {
            char a = stack.pop();
            if ((a == '(' || a == '{' || a == '[') && x == s.length() - 1) {
                return false;
            }
            else if (a == ')') {
                numCurve++;
                order.push(a);
            }
            else if (a == '}') {
                numCurl++;
                order.push(a);
            }
            else if (a == ']') {
                numBar++;
                order.push(a);
            }
            else if (order.size() > 0) {
                if (a == '(' && order.peek() == ')') {
                    numCurve--;
                    order.pop();
                }
                else if (a == '{' && order.peek() == '}') {
                    numCurl--;
                    order.pop();
                }
                else if (a == '[' && order.peek() == ']') {
                    numBar--;
                    order.pop();
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
            x--;
        }
        if (numCurve == 0 && numCurl == 0 && numBar == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}