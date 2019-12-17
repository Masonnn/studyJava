package Chapter4.Iterator_Interface;

import Chapter4.Iterator_Interface.mylist.MyArrayList;

import java.util.Collection;

public class UseListAppMain {
    public static void main(String[] args) {
        printCollection(addElementsToCollection(new MyArrayList()));
    }

    private static Collection addElementsToCollection(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i % 5));
        }
        return collection;
    }

    private static void printCollection(Collection collection) {
        System.out.println();
        System.out.println("输出 " + collection.getClass() + " 中的元素，共 " + collection.size() + " 个");
        try {
            for (Object element : collection) {
                System.out.println(element);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
