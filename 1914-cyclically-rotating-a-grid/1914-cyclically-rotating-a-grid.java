class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top < bottom && left < right) {
            // 1. Extract elements of the current layer
            List<Integer> layer = new ArrayList<>();
            for (int j = left; j < right; j++) layer.add(grid[top][j]); // Top row
            for (int i = top; i < bottom; i++) layer.add(grid[i][right]); // Right col
            for (int j = right; j > left; j--) layer.add(grid[bottom][j]); // Bottom row
            for (int i = bottom; i > top; i--) layer.add(grid[i][left]); // Left col

            // 2. Calculate effective rotations
            int size = layer.size();
            int rotations = k % size;

            // 3. Put elements back in rotated positions
            int idx = rotations;
            for (int j = left; j < right; j++) grid[top][j] = layer.get(idx++ % size);
            for (int i = top; i < bottom; i++) grid[i][right] = layer.get(idx++ % size);
            for (int j = right; j > left; j--) grid[bottom][j] = layer.get(idx++ % size);
            for (int i = bottom; i > top; i--) grid[i][left] = layer.get(idx++ % size);

            // 4. Move to the next inner layer
            top++; bottom--; left++; right--;
        }
        return grid;
    }
}
