class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        row=[]
        col=[]
        for i in range(0,len(matrix)):
            for j in range(0,len(matrix[i])):
                if matrix[i][j]==0:
                    row.append(i)
                    col.append(j)
        for i in row:
            for j in range(0,len(matrix[i])):
                matrix[i][j]=0
        for i in col:
            for j in range(0,len(matrix)):
                matrix[j][i]=0
        return matrix

        