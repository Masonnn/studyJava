package GuessNumber;

import java.util.Scanner;

public class GuessNum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int startRange = 0;
        int endRange = 40;
        int totalNum = 5;

        int mod = endRange - startRange;

        boolean stopGame = false;

        int guessTotal = 0;
        int guessCorrect = 0;
        System.out.println("************************猜数字游戏*************************");
        while (!stopGame) {

            System.out.println("按-1退出游戏，按其他数字开始游戏");
            int quit = in.nextInt();
            if (quit == -1) {
                System.out.println("退出游戏……");
                break;
            }

            System.out.print("随机数字已生成。共可猜测5次，");
            int randNum = (int) (Math.random() * endRange * 100) % mod;
            randNum = randNum + startRange;

            if (randNum <= startRange) {
                randNum += 1;
            }
            if (randNum >= endRange) {
                randNum -= 1;
            }

            for (int i = 0; i < totalNum; i++) {

                System.out.println("剩余" + (totalNum - i) + "次，猜测范围" + startRange + "到" + endRange + "，但不包含这俩数。请输入：");
                int guessNum = in.nextInt();

                if (guessNum >= endRange || guessNum <= startRange) {
                    System.out.println("输入超出范围了!!!!!");
                    continue;
                }

                if (randNum == guessNum) {
                    System.out.println("Bingo!!! 猜中了!!!");
                    guessCorrect++;
                    break;
                } else if (guessNum > randNum) {
                    System.out.println("猜大了");
                } else {
                    System.out.println("猜小了");
                }

                if (i == 5) {
                    System.out.println("没猜中，随机数是" + randNum);
                    break;
                }

            }
            guessTotal++;
            System.out.println("================已经玩了" + guessTotal + "次，其中正确" + guessCorrect + "次。====================");

        }

    }

}
