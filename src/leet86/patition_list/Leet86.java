package leet86.patition_list;

/**
 * Created by Administrator on 2016/4/20.
 */
public class Leet86 {

    public static void main(String[] args) {
        Leet86 l = new Leet86();

        ListNode head = new ListNode(5);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode node = l.partition(head, 3);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode preNode = newHead;
        ListNode currentNode = head;

        ListNode insertNode = null;
        ListNode tempNode = null;
        boolean notGetInsertNode = true;

        while (currentNode != null) {
            tempNode = currentNode.next;
            if (notGetInsertNode && currentNode.val >= x) {
                insertNode = preNode;
                preNode = currentNode;
                notGetInsertNode = false;
            } else if (!notGetInsertNode && currentNode.val < x) {
                preNode.next = currentNode.next;
                currentNode.next = insertNode.next;
                insertNode.next = currentNode;
                insertNode = currentNode;
            } else {
                preNode = currentNode;
            }
            currentNode = tempNode;
        }
        return newHead.next;
    }


}
