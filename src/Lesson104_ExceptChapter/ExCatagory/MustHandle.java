package Lesson104_ExceptChapter.ExCatagory;

public class MustHandle {
    public static void main(String[] args) throws ClassNotFoundException{

        try {
            Class clazz = Class.forName("Lesson104_ExceptChapter.ExCatagory.MustHandle");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
