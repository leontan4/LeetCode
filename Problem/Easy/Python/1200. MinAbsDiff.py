# Brute Force Solution
class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        
        n = len(arr)
        diff = []
        new =[]

        arr.sort()

        for i in range(n-1):
            abs_diff = abs(arr[i+1] - arr[i])
            diff.append(abs_diff)

        min_abs = min(diff)
        total = 0

        for i in range(len(diff)):
            if (diff[i] == min_abs):
                total+=1

        for i in range(n-1):
            finalList = []

            for j in range(1):
                x = abs(arr[i+1] - arr[i])
                if(x == min_abs and x not in finalList):
                    finalList.append(arr[i])
                    finalList.append(arr[i+1])

            new.append(finalList)

        list2 = [x for x in new if x != []]

        return list2

# Approach 2 
class Solution:
def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
    
    arr.sort()
    n = len(arr)

    # Create an outer array
    nums = []
    
    for i in range(1, n):

        # If outer array is empty, add the first pair from arr
        if (nums == []):
            nums.append([arr[i-1], arr[i]])

        else:

            # Compare the current sorted array with the elements in outer array 
            # if the absolute difference is lesser than outer, create empty array and add into it
            if abs(arr[i-1] - arr[i]) < abs(nums[0][0] - nums[0][1]):
                nums = []
                print("This one is empty: " + nums)
                nums.append([arr[i-1], arr[i]])

            elif abs(arr[i-1] - arr[i]) == abs(nums[0][0] - nums[0][1]):
                nums.append([arr[i-1], arr[i]])
                                                                                      
    return nums