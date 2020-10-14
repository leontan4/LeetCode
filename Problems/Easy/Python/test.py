### Ignore this file, is use for testing purposes. 


# n = int(input("Enter array length: "))

arr = 'abbceddrr'

for i in range(1, len(arr)):
    if(arr[i] == arr[i-1]):
        print("False")



# arr.sort()
# k = int(input("Enter target: "))

# low = 0
# high = len(arr) - 1
# mid = (high + low) / 2
# while high - low > 1:
#     count = 0
#     for i in arr:
#         if mid < i <= high:
#             count += 1

# print(count)
# print(len(new_arr))

# class Solution(object):
#     def findDuplicate(self, nums):
#         low = 0
#         high = len(nums) - 1
#         mid = (high + low) / 2
#         while high - low > 1:
#             count = 0
#             for i in nums:
#                 if mid < i <= high:
#                     count += 1
#             if count > high - mid:
#                 low = mid
#             else:
#                 high = mid
#             mid = (high + low) / 2
#         return high

# print(3//2)