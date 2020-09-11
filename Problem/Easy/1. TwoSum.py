#Brute Force Solution - O(n^2)
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        total = 0

        for i in range(len(nums)):

            total = nums[i]    

            for j in range(i+1, len(nums)):
                total = nums[i]
                total += nums[j]

                if(total == target):
                    break

            if(total == target):
                break
            
        return str(i), str(j)

# Efficient Solution
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        h = {}
        for i, num in enumerate(nums):
            n = target - num
            if n not in h:
                h[num] = i
            else:
                return [h[n], i]