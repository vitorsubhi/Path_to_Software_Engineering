//Time Complexity: O(n) Ω(1)
//Space Complexity: O(n) Ω(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int num:nums){
            if (map.containsKey(num)){
                return true;
            }
            map.put(num, num);
        }
        return false;
    }
}
