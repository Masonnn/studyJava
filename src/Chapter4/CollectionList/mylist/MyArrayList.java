package Chapter4.CollectionList.mylist;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyArrayList implements List {
    private Object[] elements;
    private int curr;

    public MyArrayList() {
        elements = new Object[16];
        curr = 0;
    }

    @Override
    public int size() {
        return curr;
    }

    @Override
    public boolean isEmpty() {
        return curr == 0;
    }

    @Override
    public boolean contains(Object o) {

        for (Object ele : elements) {
            if (Objects.equals(ele, 0)) {
                return true;
            }
        }

        return false;
    }


    @Override
    public void clear() {
        curr = 0;
    }


    @Override
    public Object get(int index) {
        if (index > curr || index < 0) {
            throw new IndexOutOfBoundsException("out of bound" + curr + " for " + index);
        }

        return elements[index];
    }


    public boolean add(Object o) {
        if (curr == elements.length - 1) {
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[curr] = o;
        curr++;
        return true;
    }


    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();

    }


    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEach(Consumer action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate filter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(Comparator c) {
        throw new UnsupportedOperationException();
    }


    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Stream stream() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Stream parallelStream() {
        throw new UnsupportedOperationException();
    }

}
