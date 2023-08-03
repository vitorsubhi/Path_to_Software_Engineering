class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int retorno[] = {0, 0};
        for (i = 0; i < nums.length; i++)
        {
            for (j = nums.length-1; j > i; j--)
            {
                if(nums[i] + nums[j] == target)
                {
                    retorno[0] = i;
                    retorno[1] = j;
                    break;
                }
            }
        }
        return retorno;
    }
}