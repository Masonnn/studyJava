package GuessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //游戏设置
        int rangeStart = 1;
        int rangeEnd = 100;
        int guessTotal = 5;

        //游戏统计
        int totalGameCount = 0;
        int totalCorrectCount = 0;

        //是否结束游戏
        boolean stopGame = false;

        while (!stopGame) {
            //初始化本次游戏的设置
            int guessLeft = guessTotal;
            int mod = rangeEnd - rangeStart;
            double randNum = Math.random();
            int num = ((int) (randNum * rangeEnd * 100)) % mod;

            num += rangeStart;

            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }
            if (num <= rangeStart) {
                num = rangeStart + 1;
            }

            System.out.println("===================== Guess Number =======================");
            System.out.println("目标已生成，数字在" + rangeStart + "到" + rangeEnd + "之间，不包括这两个数。共有" + guessTotal + "次猜测机会。输入-1可结束游戏");

            //本次游戏是否开始了
            boolean gameStart = true;

            //
            boolean guessCorrect = false;

            while (guessLeft > 0) {
                System.out.println("还有" + guessLeft + "次机会，请输入猜测的数字，回车确认");
                int guessNum = in.nextInt();
                // 输入-1，结束游戏
                if (guessNum == -1) {
                    stopGame = true;
                    break;
                }

                if (guessNum <= rangeStart || guessNum >= rangeEnd) {
                    System.out.println("请输入在" + rangeStart + "到" + rangeEnd + "之间的数字，不包括这两个数。");
                    continue;
                }
                // 只要至少猜过一次，就算玩过了。
                if (gameStart) {
                    totalGameCount++;
                    gameStart = false;
                }
                // 可以用的猜测次数减1
                guessLeft--;
                if (guessNum == num) {
                    totalCorrectCount++;
                    guessCorrect = true;
                    System.out.println("恭喜你猜对了！这次的数字就是" + num +
                            "。本次你共猜了" + (guessTotal - guessLeft) + "次。");
                    break;
                } else if (guessNum > num) {
                    System.out.println("猜测的数字比目标数字大。");
                } else {
                    System.out.println("猜测的数字比目标数字小。");
                }
            }
            if (!guessCorrect) {
                System.out.println("本次的目标数字是" + num + "。这次没有猜中。");
            }
        }
        System.out.println("共进行了" + totalGameCount + "次游戏，其中正确的为" + totalCorrectCount + "次");

    }
}
