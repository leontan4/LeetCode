# Optimal solution
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        
        outer = []
        
        for i in range(rowIndex+1):
    
            inner = []

            for j in range(i+1):

                if(j==0 or j==i):
                    inner.append(1)

                else:
                    x = outer[i-1][j] + outer[i-1][j-1]
                    inner.append(x)
            outer.append(inner)
            
        return outer[rowIndex]