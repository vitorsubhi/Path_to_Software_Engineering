//Time Complexity: θ(n)
//Space Complexity: θ(1)
class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        int i, j;
        for (i = 0, j = y.length()-1; i < j; i++, j--)
        {
            if (y.charAt(i) != y.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
