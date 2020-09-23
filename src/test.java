import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 1, 3, 5, 2, 7, 8, 0, -1};
        int left = 0, right = array.length - 1;
//        mergeSort(array, left, right);

        quictSort(array, 0, array.length - 1);
//        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quictSort(int[] array, int begin, int end) {
        if (begin >= end) return;

        int pivot = partition(array, begin, end);
        quictSort(array, begin, pivot - 1);
        quictSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = end, counter = begin;

        for (int i = begin; i < array.length; i++) {
            if (array[i] > array[pivot]) {
                int temp = array[i];
                array[i] = array[counter];
                array[counter] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        return counter;
    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (map.containsKey(com)) {
                return new int[]{map.get(com), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}

