//Brute Force
//Time Complexity: O(n²) Ω(1)
//Space Complexity: θ(1)
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

//Hash Table
//Time Complexity: O(n) Ω(1)
//Space Complexity: O(n) Ω(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int cur = nums[i];
            int x = target - cur;
            if (map.containsKey(x)){
                return new int[] { map.get(x), i };
            }
            map.put(cur, i);
        }
        return null;
    }
}