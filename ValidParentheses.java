class ValidParentheses {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for(char ch: s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else if(ch==')' && !stack.empty() && stack.peek()=='(')
            {
                stack.pop();
            }
            else if(ch=='}' && !stack.empty() && stack.peek()=='{')
            {
                stack.pop();
            }
            else if(ch==']' && !stack.empty() && stack.peek()=='[')
            {
                stack.pop();
            }
            else
            {
                return false;
            }
                
        }
        if(stack.size()==0)
            return true;
    
    return false;
    }
}
