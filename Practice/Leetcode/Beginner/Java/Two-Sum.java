//Brute Force
//Time Complexity: O(n²)
//Space Complexity: O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++)
        {
            for (j = nums.length-1; j > i; j--)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}