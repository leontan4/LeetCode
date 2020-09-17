### Ignore this file, is jsut use for testing purposes. 


n = int(input("Enter array length: "))

outer = [] 

for i in range(n):
    
    inner = []

    for j in range(i+1):

        if(j==0 or j==i):
            inner.append(1)
        
        else:
            x = outer[i-1][j] + outer[i-1][j-1]
            inner.append(x)
    outer.append(inner)

rowIndex = int(input("Enter which row to check: "))

print(outer[rowIndex])

# if (n<=1):
#     print(str(n))

# if(n==2):
#     n= n-1
#     print(str(n))
# else: 

#     nums.append(0)
#     nums.append(1)

#     for i in range(n):
#         x = nums[i-1] + nums[i-2]

#         nums.append(x)

# print(nums)



# prev = {}
# count = 0

# for i in nums:
#     if i in prev:

#         count += prev.get(i)
#         prev[i] += prev.get(i) + 1

#     else:
#         prev[i] = 1

#     print(count)