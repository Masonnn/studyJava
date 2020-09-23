package algo.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 1};
//        int n = nums.length;
        int begin = 0, end = nums.length - 1;
        quickSort(nums, begin, end);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void quickSort(int[] array, int begin, int end) {
        // terminator
        if (end <= begin) return;

        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    private static int partition(int[] a, int begin, int end) {
        // pivot: 标杆位置， counter: 小于pivot的元素的个数
        int pivot = end, counter = begin;
        for (int i = begin; i < end; i++) {
            if (a[i] < a[pivot]) {
                int temp = a[counter]; // 表示最后大于它元素的位置？？？
                a[counter] = a[i];
                a[i] = temp;
                counter++;
            }
        }
        int temp = a[pivot];
        a[pivot] = a[counter];
        a[counter] = temp;
        return counter;
    }
}
