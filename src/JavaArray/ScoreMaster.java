package JavaArray;

import java.util.Scanner;

public class ScoreMaster {
    public static void main(String[] args) {

        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        int totalScoreCount = 6;

        // 每门课的名字
        String[] names = new String[totalScoreCount];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入共有多少年的成绩：");

        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][totalScoreCount];

        // 生成随机成绩
        for (int i = 0; i < yearCount; i++) {
            System.out.println("*********************第" + (i + 1) + "年的成绩如下***********************");
            for (int j = 0; j < totalScoreCount; j++) {
                scores[i][j] = 75 + Math.random() * 25;
                System.out.println("第" + (i + 1) + "年的 " + names[j] + " 成绩是：" + scores[i][j]);

            }
        }

        boolean cont = true;
        while (cont) {
            System.out.println("请选择要进行的操作");
            System.out.println("1：求某年的最好成绩。\n"
                    + "2：求某年的平均成绩。\n"
                    + "3: 求所有年份最好成绩。\n"
                    + "4: 求某门课历年最好成绩。");

            int oprtId = scanner.nextInt();

            int year = 0;

            switch (oprtId) {
                case 1:
                    System.out.println("计算某年的最好成绩，请输入年份：");
                    year = scanner.nextInt();
                    if (year <= 0 || year > yearCount) {
                        System.out.println("非法的年份:" + year);
                        cont = false;
                        break;
                    }
                    year -= 1;

                    int bestOfYearScoreId = 0;
                    for (int i = 1; i < totalScoreCount; i++) {
                        if (scores[year][bestOfYearScoreId] < scores[year][i]) {
                            bestOfYearScoreId = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年的成绩最好的科目是" + names[bestOfYearScoreId] + "，成绩是" + scores[year][bestOfYearScoreId] + "。");
                    break;
                case 2:
                    System.out.println("计算某年的平均成绩，请输入年份：");
                    year = scanner.nextInt();
                    if (year <= 0 || yearCount < year) {
                        System.out.println("非法的年份:" + year);
                        cont = false;
                        break;
                    }
                    year -= 1;

                    double totalCountForAvg = 0;
                    for (int i = 0; i < totalScoreCount; i++) {
                        totalCountForAvg += scores[year][i];
                    }
                    double avgOfYear = totalCountForAvg / totalScoreCount;
                    System.out.println("第" + (year + 1) + "年的平均成绩为" + avgOfYear + "。");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }

        }


    }
}
