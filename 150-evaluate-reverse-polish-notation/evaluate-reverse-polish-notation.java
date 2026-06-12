class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        int res;
        for(String token: tokens){
            if(token.equals("+")){
                int x=stack.pop();
                int y=stack.pop();
                res=y+x;
                stack.push(res);
            }else if(token.equals("-")){
                int x=stack.pop();
                int y=stack.pop();
                res=y-x;
                stack.push(res);
            }else if(token.equals("*")){
                int x=stack.pop();
                int y=stack.pop();
                res=y*x;
                stack.push(res);
            }else if(token.equals("/")){
                int x=stack.pop();
                int y=stack.pop();
                res=y/x;
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}