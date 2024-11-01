//Brute Force
//Time Complexity: θ(n)
//Space Complexity: O(n) Ω(1)
class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char c, p;
        int i;
        for (i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if("{([".indexOf(c) != -1){
                stack.push(c);
            } else if("})]".indexOf(c) != -1 && !stack.empty()){
                p = stack.pop();
                if (!((p == '{' && c == '}') || (p == '(' && c == ')') || (p == '[' && c == ']'))){
                    return false;
                }
            } else {
                return false;
            }
        }
        if (stack.empty){
            return true;
        }
        else {
            return false;
        }
    }
}
