public class test {
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 1, 3, 5, 2, 7, 8};
//        int n = nums.length;
        int left = 0, right = array.length - 1;
        quickSort(array, left, right);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] arr, int begin, int end) {

        int pivot = end, counter = begin;
        for (int i = begin; i < end; i++) {
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter++;
            }
        }
        int temp = arr[counter];
        arr[counter] = arr[pivot];
        arr[pivot] = temp;
        return counter;
    }
}

