#Brute Force
#Time Complexity: O(n)
#Space Complexity: θ(1)
def remove_element(nums, val)
    nums.delete_if { |value| value == val }
    nums.length
end
