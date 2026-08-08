class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();

        if(s.length()<=1) return false;

        if(s.charAt(0)==']'||s.charAt(0)=='}'||s.charAt(0)==')')
        return false;

        stk.push(s.charAt(0));

        for(int i=1;i<s.length();i++){

            if(stk.isEmpty()&&(s.charAt(i)==']'||s.charAt(i)=='}'||s.charAt(i)==')'))
            return false;
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'&& !stk.isEmpty() && stk.peek()!='('){
                return false;
            }
            else if(s.charAt(i)=='}'&& !stk.isEmpty() && stk.peek()!='{'){
                return false;
            }
            else if(s.charAt(i)==']'&& !stk.isEmpty() && stk.peek()!='['){
                return false;
            }
            else{
                if(!stk.isEmpty())stk.pop();
            }
        }
        if(stk.size()>0)
        return false;
        return true;
    }
}