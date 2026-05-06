class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            String str = String.valueOf(s.charAt(i));
            if(str.equals("(") || str.equals("[") || str.equals("{")) {
                stack.push(str);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                if(str.equals(")")) {
                    if(stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if(str.equals("}")) {
                    if(stack.peek().equals("{")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if(str.equals("]")) {
                    if(stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
        }
        }
        return stack.isEmpty();
    }
}
