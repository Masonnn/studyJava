package algo;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    int rows[];
    // hill and dale diagonals
    int hills[];
    int dales[];

    int n;

    List<List<String>> output = new ArrayList<>();

    // queens positions
    int queens[];

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        rows = new int[n];
        hills = new int[4 * n - 1];
        dales = new int[2 * n - 1];
        queens = new int[n];

        backtrack(0);
        return output;
    }

    private void backtrack(int row) {
        for (int col = 0; col < n; col++) {
            if (isNotUnderAttack(row, col)) {
                placeQueen(row, col);
                // TODO: 2020/7/6
                if (row + 1 == n) addSolution();
                else backtrack(row + 1);
                removeQueen(row, col);
            }
        }
    }

    private boolean isNotUnderAttack(int row, int col) {
        int res = rows[col] + hills[row - col + 2 * n] + dales[row + col];
        return (res == 0) ? true : false;
    }

    private void removeQueen(int row, int col) {
        queens[row] = 0;
        rows[col] = 0;
        hills[row - col + 2 * n] = 0;
        dales[row + col] = 0;
    }

    private void addSolution() {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int col = queens[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < col; j++) {
                sb.append(".");
            }
            sb.append("Q");
            for (int j = 0; j < n - col - 1; j++) {
                sb.append(".");
            }
            solution.add(sb.toString());
        }
        output.add(solution);
    }

    private void placeQueen(int row, int col) {
        queens[row] = col;
        rows[col] = 1;
        hills[row - col + 2 * n] = 1;
        dales[row + col] = 1;
    }


    public static void main(String[] args) {
        int n = 4;
        NQueens nQueens = new NQueens();
        nQueens.solveNQueens(n);
    }

}
