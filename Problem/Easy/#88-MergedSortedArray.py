 def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        # Edge case: theres no space in the first list
        if m == len(nums1):
            return 
        
        start2 = 0 # starting position of the second list
        
        # first merge both lists
        for i in range(m, len(nums1)):
            nums1[i] = nums2[start2]
            start2 += 1
        
        nums1.sort() #sort list
