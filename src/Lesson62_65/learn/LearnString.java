package Lesson62_65.learn;

public class LearnString {
    public static void main(String[] args) {
        // 不可改变，immutable
        String content = "09234567ABCDefgh";

        // String的length()是个方法不是属性哦
        System.out.println(content.length());

        // 其实是生成了一个新的String对象
        System.out.println(content.toLowerCase());
        System.out.println(content.toUpperCase());

        // content指向对象的内容并没有变化
        System.out.println(content);

        System.out.println(content.charAt(8));
//        System.out.println(content.charAt(99));

        System.out.println(content.substring(5));
        System.out.println(content.substring(5,7));


    }
}
