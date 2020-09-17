n = int(input("Enter array length: "))

nums = []
nums2 = []

for i in range(n):
    x = int(input("Enter elements: "))
    nums.append(x)

nums.reverse()

print(nums)

for j in range(n):
    x = nums[j]
    nums2.append(x)

nums2.reverse()

if (nums == nums2):
    print("True")
else:
    print("False")

# prev = {}
# count = 0

# for i in nums:
#     if i in prev:
#         count += prev.get(i)
#         prev[i] += prev.get(i) + 1
#         print(str(prev.get(i)))
#     else:
#         prev[i] = 1

# print(count)

