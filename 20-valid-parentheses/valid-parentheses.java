class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>(); //initialize a stack
        for(char c: s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c); //push the element into stack if it is a left bracket
            }else{
                if(stack.isEmpty()) return false; 
                
                char top=stack.pop(); //if top element is not corresponding to char return false
                if(top=='(' && c!=')') return false;
                if(top=='[' && c!=']') return false;
                if(top=='{' && c!='}') return false;
            }
        }
        return stack.isEmpty(); //true if empty stack
    }
}