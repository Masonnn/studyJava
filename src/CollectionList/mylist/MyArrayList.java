package CollectionList.mylist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {
    private Object[] elements;
    private int curr;

    public MyArrayList() {
        elements = new Object[16];
        curr = 0;
    }



}
