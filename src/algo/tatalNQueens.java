package algo;

public class tatalNQueens {

    private int size;
    private int count;

    public int totalNQueens(int n) {
        count = 0;
        size = (1 << n) - 1; // 所有可以放皇后的位置
        solve(0, 0, 0);
        return count;
    }

    private void solve(int row, int ld, int rd) {
        System.out.println("================================================== solve recurion ===============");
        System.out.println("size的值 " + size);
        System.out.println("size的二进制值 " + Integer.toBinaryString(size));
        System.out.println("count值  "+count);
        if (row == size) {
            count++;
            return;
        }
        int pos = size & (~(row | ld | rd)); // 当前层能放皇后的所有位置
        while (pos != 0) {
            System.out.println("=============== whlie loop ===============");
            int p = pos & (-pos); // 获得最低位的1
            System.out.println("p的值是 "+p);
            System.out.println("p的二进制值是 "+Integer.toBinaryString(p));
            pos -= p;  // 在该位置放上皇后
            System.out.println("pos值 "+pos);
            System.out.println("pos二进制值 "+Integer.toBinaryString(pos));
            solve(row | p, (ld | p) << 1, (rd | p) >> 1);
        }
    }

    public static void main(String[] args) {
        tatalNQueens a = new tatalNQueens();
        a.totalNQueens(4);
    }

}
