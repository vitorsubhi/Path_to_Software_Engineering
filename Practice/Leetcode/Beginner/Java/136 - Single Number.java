//Hash Table
//Time Complexity: θ(n)
//Space Complexity: θ(n)
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int num:nums){
            if (map.containsKey(num)){
                map2.put(num, num);
            }
            map.put(num, num);
        }
        for (int num:nums){
            if (!map2.containsKey(num)){
                return num;
            }
        }
        return 0;
    }
}
