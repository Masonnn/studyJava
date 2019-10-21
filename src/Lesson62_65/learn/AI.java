package Lesson62_65.learn;

import java.util.Scanner;

public class AI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================AI, 随便问=========================");
        while (true) {
            String input = scanner.next();

            if ("exit".equals(input)) {
                System.out.println("再见！");
                break;
            }


            boolean replied = false;

            String[] canStart = new String[]{"会", "能", "有", "敢", "在" };

            for (int i = 0; i < canStart.length && (!replied); i++) {
                if (input.startsWith(canStart[i])) {
                    System.out.println(canStart[i] + "!");
                    replied = true;
                    break;
                }

            }


            String[] askTail = new String[]{"吗？", "吗?", "吗" };

            for (int i = 0; i < askTail.length && (!replied); i++) {
                if (input.endsWith(askTail[i])) {
                    System.out.println(input.replace(askTail[i], "!"));
                    replied = true;
                    break;
                }
            }
            if (!replied) {
                System.out.println(input + "!");
            }

        }
    }
}
