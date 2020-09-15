# Brute Force Solution - O(n^2)
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
        hashmap = {}
        for i, x in enumerate(nums):
            y = target - x  # target = x+y
            if y not in hashmap:
                hashmap[x] = i  # add the current element to hashmap with it's index
            else:  # since the other element already exists in the hashmap thus directly return the indexes of both.
                return [hashmap[y], i] # the "y" that is returned, is to locate the "x" in the hashmap.