package CollectionList.mylist;

import java.util.*;
//import java.util.function.Consumer;
//import java.util.function.IntFunction;
//import java.util.function.Predicate;
//import java.util.function.UnaryOperator;
//import java.util.stream.Stream;

public class MyLinkedList implements List {

    static class ListNode {
        public ListNode(ListNode prev, ListNode next, Object value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        ListNode prev;
        ListNode next;
        Object value;

    }

    private ListNode start = null;
    private ListNode tail = null;

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {

        ListNode curr = start;

        while (curr != null) {
            if (Objects.equals(curr.value, o)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

//    @Override
//    public Object[] toArray(IntFunction generator) {
//        return new Object[0];
//    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

//    @Override
//    public boolean removeIf(Predicate filter) {
//        return false;
//    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

//    @Override
//    public void replaceAll(UnaryOperator operator) {
//
//    }

    @Override
    public void sort(Comparator c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        start = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("out of bound " + size + " for " + index);
        }
        ListNode curr = start;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.value;
    }

    public boolean add(Object o) {
        ListNode newNode = new ListNode(tail, null, o);
        if (start == null) {
            start = newNode;
        }
        if (tail != null) {
            tail.next = newNode;
        }

        tail = newNode;

        size++;
        return true;

    }


    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, Object element) {
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

//    @Override
//    public Stream stream() {
//        return null;
//    }

//    @Override
//    public Stream parallelStream() {
//        return null;
//    }

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
}
