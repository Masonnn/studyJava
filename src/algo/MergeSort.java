package algo;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 1};
//        int n = nums.length;
        int begin = 0, end = nums.length - 1;
        mergeSort(nums, begin, end);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;

        int mid = (left + right) >> 1;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);

    }

    private static void merge(int[] arr, int left, int mid, int right) {


        int[] temp = new int[right - left + 1]; //中间数组
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }

    }
}
