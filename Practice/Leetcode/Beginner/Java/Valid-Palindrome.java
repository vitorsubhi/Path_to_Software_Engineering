//Brute Force
//Time Complexity: θ(n)
//Space Complexity: θ(1)
class Solution {
    public boolean isPalindrome(String s) {
        String pattern = "[^a-zA-Z0-9]+";
        s = s.replaceAll(pattern, "").toLowerCase();
        int i, j;
        for (i = 0, j = s.length()-1; i < j; i++, j--)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}