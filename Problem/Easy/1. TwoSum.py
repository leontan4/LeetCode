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
