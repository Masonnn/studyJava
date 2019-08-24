package GuessNumber;

import java.util.Scanner;

public class GuessNumCopy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 游戏设置
        int rangeStart = 1;
        int rangeEnd = 40;
        int guessTotal = 5;

        // 统计设置
        int totalGameCount = 0;
        int totalCorrectCount = 0;

        // 是否结束游戏
        boolean stopGame = false;

        while (!stopGame) {
            // 生成符合要求的随机数
            int mod = rangeEnd - rangeStart;
            double randNum = Math.random();

            int num = ((int) (randNum * rangeEnd * 100)) % mod + rangeStart;

            // 边界问题，不能包含开始和结束这两个数
            if (rangeStart <= num) {
                num += 1;
            }
            if (rangeEnd >= num) {
                num -= 1;
            }

            System.out.println("*********************猜数字游戏************************");
            System.out.println("目标已生成，数字在" + rangeStart + "到" + rangeEnd + "之间，不包括这两个数。共有" + guessTotal + "次猜测机会。输入-1可结束游戏");

            // 游戏开始
            boolean gameStart = true;

            // 是否猜对
            boolean guessCorrect = false;

            //剩余猜测次数
            int guessLeft = guessTotal;
            while (guessLeft > 0) {
                System.out.println("还有" + guessLeft + "次机会，请输入猜测的数字，回车确认");
                int guessNum = in.nextInt();
                //用户输入-1，结束游戏
                if (guessNum == -1) {
                    stopGame = true;
                    break;
                }

                // 用户输入超出范围的数，给出提示，游戏继续
                if (guessNum <= rangeStart || guessNum >= rangeEnd) {
                    System.out.println("输入数据超出了范围");
                    continue;
                }

                // 只要至少猜过1次，就算玩过了
                if (gameStart) {
                    totalGameCount++;
                    gameStart = false;
                }
                //猜测次数-1
                guessLeft--;
                if (guessNum == num) {
                    totalCorrectCount++;
                    guessCorrect = true;
                    System.out.println("恭喜你猜对了！这次的数字就是" + num + "。本轮游戏用了" + (guessTotal - guessLeft) + "次就猜对了");
                    break;
                } else if (guessNum > num) {
                    System.out.println("大了");
                } else {
                    System.out.println("小了");
                }

            }
            if (!guessCorrect) {
                System.out.println("随机数是" + num + "，本轮没猜中。");
            }

        }
        System.out.println("共进行了" + totalGameCount + "轮游戏，其中猜对了" + totalCorrectCount + "轮。");
    }
}
