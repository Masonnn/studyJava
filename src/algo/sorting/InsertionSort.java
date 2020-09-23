package algo.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 1, 2, 3};
        int n = nums.length;
        insertionSort(nums, n);

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void insertionSort(int[] nums, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; i++) {
            int value = nums[i];
            int j = i - 1;
            // 查找插入位置
            for (; j >= 0; j--) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];// 数据移动
                } else {
                    break;
                }
            }
            nums[j + 1] = value; // 插入数据
        }
    }
}
