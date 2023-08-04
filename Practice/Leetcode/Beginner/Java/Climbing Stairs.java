//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c, i;
        for (i = 2; i <= n+1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}