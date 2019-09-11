package JavaArray;

public class MultiDimensionArray {
    public static void main(String[] args) {
        double[][] doubles = new double[3][5];

        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.println("doubles[" + i + "][" + j + "] = " + doubles[i][j]);
            }
        }

        doubles[2] = new double[100];

        for (int i = 0; i < doubles.length; i++) {
            System.out.println("doubles[" + i + "].length = " + doubles[i].length);
        }
    }
}
