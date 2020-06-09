package algo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 1, 2, 3};
//        int n = nums.length;
        bubbleSort(nums);
    }

    private static void bubbleSort(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {

            boolean flag = false;

            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;

        }

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }

}
