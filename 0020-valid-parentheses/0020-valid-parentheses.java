class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(char ch : s.toCharArray()){
            switch (ch){
                case '(':
                case '{':
                case '[':
                    st.push(ch);
                    break;
                case')':
                    if(st.isEmpty() || st.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(st.isEmpty() || st.pop() != '{'){
                        return false;
                    }
                    break;
                case']':
                    if(st.isEmpty() || st.pop() != '['){
                        return false;
                    }
                    break;
            }
        }

        return st.isEmpty();
    }
}