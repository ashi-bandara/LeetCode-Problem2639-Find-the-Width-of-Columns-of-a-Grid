class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] result = new int[grid[0].length];

        for (int i = 0; i < grid[0].length; i++) {
            int width = 0;
            for (int j = 0; j < grid.length; j++) {
                int elementLength = String.valueOf(grid[j][i]).length();
                width = Math.max(elementLength,width);
            }
            result[i] = width;
        }
        return result;
    }
}