package GuessNumber;

import java.util.Scanner;

public class GuessNum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Game settings
        int rangeStart = 10;
        int rangeEnd = 20;
        int guessTotal = 5;

        //
        int totalGameCount = 0;
        int totalCorrectCount = 0;

        //
        boolean stopGame = false;

        while (!stopGame) {
            //
            int guessLeft = guessTotal;
            int mod = rangeEnd - rangeStart;
            double randNum = Math.random();
            int num = ((int) (randNum * rangeEnd * 100)) % mod + rangeStart;

            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }
            if (num <= rangeStart) {
                num = rangeStart + 1;
            }

            System.out.println("***************************Guess Number****************************");
            System.out.println("随机数已生成，范围在" + rangeStart + "到" + rangeEnd +
                    "之间，不包括" + rangeStart + "和" + rangeEnd + "。共有" + guessTotal + "次猜测机会。输入-1可结束游戏。");

            boolean gameStart = true;

            boolean guessCorrect = false;

            while (guessLeft > 0) {
                System.out.println("还有" + guessLeft + "次机会，请输入猜测的数字，回车确认");
                int guessNum = in.nextInt();

                if (-1 == guessNum) {
                    stopGame = true;
                    break;
                }

                if (guessNum <= rangeStart || guessNum >= rangeEnd) {
                    System.out.println("请输入在" + rangeStart + "到" + rangeEnd + "之间的数字，不包含" + rangeStart + "和" + rangeEnd);
                    continue;
                }

                if (gameStart) {
                    totalGameCount++;
                    gameStart = false;
                }

                guessLeft--;

                if (guessNum == num) {
                    totalCorrectCount++;
                    guessCorrect = true;
                    System.out.println("恭喜你猜对了！这次的数字就是" + num +
                            "。本轮您共猜了" + (guessTotal - guessLeft) + "次");
                    break;
                } else if (guessNum > num) {
                    System.out.println("大了");
                } else {
                    System.out.println("小了");
                }

            }
            if (!guessCorrect){
                System.out.println("本次随机数是"+num+"。很遗憾，您没有猜中。打起精神再来一次吧！");
            }
            System.out.println("共进行了"+totalGameCount+"轮游戏，其中正确了"+totalCorrectCount+"轮。");

        }
    }

}
