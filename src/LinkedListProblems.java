public class LinkedListProblems {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode();

        return ans;
    }



    public static void main(String[] args) {

        TestSolution testSolution = new TestSolution();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode l2 = new ListNode(3, new ListNode(4, new ListNode(5, null)));


        System.out.println(testSolution.mergeTwoLists(l1, l2));

    }
}

class ListNode {
    Integer val;
    ListNode next;

    ListNode() {
    }

    ListNode(Integer val) {
        this.val = val;
    }

    ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

