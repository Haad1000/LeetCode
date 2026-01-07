class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        Stack<Character> curly = new Stack<>();
        Stack<Character> square = new Stack<>();
        Stack<Character> overall = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(') {
                bracket.push(x);
                overall.push(x);
            } else if (x == '{') {
                curly.push(x);
                overall.push(x);
            } else if (x == '[') {
                square.push(x);
                overall.push(x);
            } else if (x == ')') {
                if (bracket.size() < 1) {
                    return false;
                } else if (overall.peek() == bracket.peek()) {
                    overall.pop();
                    bracket.pop();
                } else {
                    return false;
                }
            } else if (x == '}') {
                if (curly.size() < 1) {
                    return false;
                } else if (overall.peek() == curly.peek()) {
                    overall.pop();
                    curly.pop();
                } else {
                    return false;
                }
            } else if (x == ']') {
                if (square.size() < 1) {
                    return false;
                } else if (overall.peek() == square.peek()) {
                    overall.pop();
                    square.pop();
                } else {
                    return false;
                }
            }
        }

        if (overall.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
}