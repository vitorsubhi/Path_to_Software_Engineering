//Time Complexity: θ(n)
//Space Complexity: θ(1)
class Solution {
    public void reverseString(char[] s) {
        char aux;
        int i, j;
        for(i=s.length-1, j=0; j < i; i--, j++){
            aux = s[j];
            s[j] = s[i];
            s[i] = aux;
        }
    }
}
