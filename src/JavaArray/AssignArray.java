package JavaArray;

import org.junit.Test;

public class AssignArray {
    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 9;
        System.out.println(array.length + "," + array[1]);

        array = new int[32];
        System.out.println(array.length);
    }

    @Test
    public void test() {
        int[] array = new int[5];
        System.out.println(array[array.length-1]);

    }
}


