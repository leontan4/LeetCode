### Ignore this file, is use for testing purposes. 


# n = int(input("Enter array length: "))

vowels = "aeiou"

string = str(input("Enter string: "))

for char in string:
    if char in vowels:

        
        print(char)


# for i in range(1, n):
#     if (result == []):
#         result.append([arr[i-1], arr[i]])
#         print("This is the first one: " + str(result))

#     else:
#         if abs(arr[i-1] - arr[i]) < abs(result[0][0] - result[0][1]):
#             result = []
#             print("This is the second one: " + str(result))
#             result.append([arr[i-1], arr[i]])

#         elif abs(arr[i-1] - arr[i]) == abs(result[0][0] - result[0][1]):
#             result.append([arr[i-1], arr[i]])

# print(result)