package JavaArray;

import java.util.Scanner;

public class OneArrayEachYear {
    public static void main(String[] args) {
        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        // 每门课的名字
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        // 每门课的成绩
        double[] year1 = new double[6];

        System.out.println("*****************第1年成绩*****************");
        for (int i = 0; i < 6; i++) {
            year1[i] = 70 + Math.random() * 20;
            System.out.println(year1[i]);
        }

        double[] year2 = new double[6];

        System.out.println("*****************第2年成绩*****************");
        for (int i = 1; i < 6; i++) {
            year2[i] = 75 + Math.random() * 20;
            System.out.println(year2[i]);
        }

        double[] year3 = new double[6];

        System.out.println("*****************第3年成绩*****************");
        for (int i = 1; i < 6; i++) {
            year3[i] = 80 + Math.random() * 20;
            System.out.println(year3[i]);
        }


        double[] yearToUse;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查看第几年的成绩：");
        int year = scanner.nextInt();

        switch (year) {
            case 1:
                yearToUse = year1;
                break;
            case 2:
                yearToUse = year2;
                break;
            case 3:
                yearToUse = year3;
                break;
            default:
                System.out.println("输入年份不对，将查看最新一年的成绩");
                yearToUse = year3;
                break;
        }
        System.out.println("请输入要查看成绩的编号：");

        int scoreIndex = scanner.nextInt() - 1;

        System.out.println("第" + year + "年的" + names[scoreIndex] + "成绩是：" + yearToUse[scoreIndex]);




    }
}
