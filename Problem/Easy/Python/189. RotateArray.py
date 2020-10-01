# Appraoch 2 (Using two arrays)
# Time --> O(n)
# Space --> O(n)

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        # setting number of elements that will be in this array
        arr = [0] * n
        
        for i in range(n):

            # Using modulo to find the position of index in arr 
            arr[(i + k) % n] = nums[i]
        
        nums[:] = arr
        
        return nums