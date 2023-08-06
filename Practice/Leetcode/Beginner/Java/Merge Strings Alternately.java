//Time Complexity: θ(n)
//Space Complexity: θ(n)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String resultado = "";
        for (int i = 0; i < word1.length() || i < word2.length(); i++){
            if (i < word1.length()){
                resultado += word1.charAt(i);
            }
            if (i < word2.length()){
                resultado += word2.charAt(i);
            }
        }
        return resultado;
    }
}