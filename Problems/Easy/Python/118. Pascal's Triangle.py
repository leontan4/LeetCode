# Optimal Solution --> O(numRows ^ 2)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # First create and outer array
        outer = []
        
        # Then we create a for loop to loop with the inner array
        for i in range(numRows):
            
            # Inner array is created for each loop
            inner = []

            for j in range(i+1):

                if(j==0 or j==i):
                    inner.append(1)

                else:
                    x = outer[i-1][j] + outer[i-1][j-1]
                    inner.append(x)
            outer.append(inner)

        return outer