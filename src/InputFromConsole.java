import java.util.Scanner;

public class InputFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请问你的名字是？");

        String string = in.nextLine();

        System.out.println(string + "，你好。请问你几岁了？");

        int age = in.nextInt();

        System.out.println("好的，" + string + age + "岁了。");
    }
}
