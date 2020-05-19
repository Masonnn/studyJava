import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestSolution {
    @Test
    public ListNode reverseList(ListNode head) {


        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }


    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {

        TestSolution testSolution = new TestSolution();

//        ListNode head = null;
//        ListNode second = null;
//        ListNode third = null;
//        ListNode fouth = null;
//        ListNode fifth = null;
//        ListNode tail = null;
//
//
//        head.val = 1;
//        head.next = second;
//
//        second.val = 2;
//        second.next = third;
//
//        third.val = 3;
//        third.next = fouth;
//
//        fouth.val = 4;
//        fouth.next = fifth;
//
//        fifth.val = 5;
//        fifth.next = tail;

        System.out.println();
//        testSolution.reverseList(head);

    }
}
