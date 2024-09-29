class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        
        List<Integer> list = new ArrayList<>();
        
        while (startRow <= endRow && startCol <= endCol) {
            // Top row (left to right)
            for (int j = startCol; j <= endCol; j++) {
                list.add(matrix[startRow][j]);
            }
            // Right column (top to bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }
            // Bottom row (right to left)
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    list.add(matrix[endRow][j]);
                }
            }
            // Left column (bottom to top)
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    list.add(matrix[i][startCol]);
                }
            }
            
            // Move the boundaries inward for the next layer
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
        return list;
    }
}

