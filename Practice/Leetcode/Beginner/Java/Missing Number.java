//Time Complexity: θ(n)
//Space Complexity: θ(n)
class Solution {
    public int missingNumber(int[] nums) {
        int maior = nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            if (num > maior)
                maior = num;
            map.put(num, num);
        }
        for (int i = 0; i < maior; i++){
            if (!map.containsKey(i)){
                return i;
            }
        }
        return maior+1;
    }
}