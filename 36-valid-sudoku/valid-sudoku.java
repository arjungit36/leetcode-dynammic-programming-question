class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char current = board[i][j];
                if (current == '.') continue;

                String rowKey = current + "_in_row_" + i;
                String colKey = current + "_in_column_" + j;
                String boxKey = current + "_in_box_" + (i / 3) + "_" + (j / 3);

                if (set.contains(rowKey) || set.contains(colKey) || set.contains(boxKey)) {
                    return false;
                }

                set.add(rowKey);
                set.add(colKey);
                set.add(boxKey);
            }
        }

        return true;
    }
}