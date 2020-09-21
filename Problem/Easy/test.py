### Ignore this file, is use for testing purposes. 


n = int(input("Enter array length: "))

arr=[]
result=[]

for i in range(n):
    x = int(input("enter elements: "))
    arr.append(x)

arr.sort()

for i in range(1, n):
    if (result == []):
        result.append([arr[i-1], arr[i]])

    else:
        if abs(arr[i-1] - arr[i]) < abs(result[0][0] - result[0][1]):
            result = []
            result.append([arr[i-1], arr[i]])

        elif abs(arr[i-1] - arr[i]) == abs(result[0][0] - result[0][1]):
            result.append([arr[i-1], arr[i]])

print(result)