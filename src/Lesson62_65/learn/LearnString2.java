package Lesson62_65.learn;

public class LearnString2 {
    public static void main(String[] args) {
        String content = "Orange_Apple_Banana";

        char[] chars = content.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("=======================");
        String sp  = "_";
        String[] s = content.split(sp);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println("=======================");
        // 求第一个匹配符号的index
        int indexOf = content.indexOf("_");
        System.out.println(indexOf);

        System.out.println(content.substring(indexOf +1,content.length()));

        System.out.println("=======================");
        System.out.println(content.contains("apple"));
        System.out.println(content.contains("Apple"));
        System.out.println(content.contains("Orange"));
        System.out.println(content.contains("Banana"));


        String content2 = "Orange_Apple_Banana";
        String content3 = "   orange_Apple_banana   ";
        String content4 = "orange_Apple_banana";
        System.out.println(content.equals(content2));
        System.out.println(content.equalsIgnoreCase(content4));
        System.out.println(content.equalsIgnoreCase(content3.trim()));
    }
}
