import org.junit.Test;

public class RandomNum {
    public static void main(String[] args) {
        double randomNum = 0;
        while (randomNum <= 0.5) {

            randomNum = Math.random();
            System.out.println(randomNum);

        }

        int rangeStart = 10;
        int rangeEnd = 50;

        for (int i = 0; i < 10; i++) {
            // 确定模
            int mod = rangeEnd - rangeStart;

            // 生成随机数
            randomNum = Math.random();

            int num = (int) (randomNum * rangeEnd * 100);
            // 取模后的值，加上最小值
            num = num % mod + rangeStart;

            if (num <= rangeStart) {
                num = rangeStart + 1;
            }
            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }

            System.out.println("第 " + i + " 次的随机数是：" + num);

        }

    }


    @Test
    public void test() {

        int num = -10;

        System.out.println(num % 2);
        System.out.println(num % -3);
        System.out.println(num % 4);
        System.out.println(num % 5);
        System.out.println(num % -6);
    }

//    @Test
//    public void test1(){
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("请问你的名字是？");
//
//        String string = in.nextLine();
//
//        System.out.println(string+"，你好。请问你几岁了？");
//
//        int age = in.nextInt();
//
//        System.out.println("好的，"+string+age+"岁了。");
//    }

}
