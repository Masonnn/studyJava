import java.util.ArrayList;
import java.util.List;

public class test {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0){
                nums[i] = nums[i] + nums[i-1];
            }
            maxSum = Math.max(nums[i], maxSum);
        }
        System.out.println(maxSum);
        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        test test = new test();

        test.maxSubArray(nums);

    }
}

