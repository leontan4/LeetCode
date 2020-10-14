# Optimal Solution
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        h = {}
        for i, num in enumerate(nums):
            n = target - num
            if n not in h:
                h[num] = i
            else:
                n = int(h[n]) + 1
                i+=1
                return [n, i]