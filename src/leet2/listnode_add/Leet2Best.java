package leet2.listnode_add;


public class Leet2Best{

	public static void main(String... args){
		Leet2Best l = new Leet2Best();

	ListNode node11 = new ListNode(2);
    ListNode node12 = new ListNode(4);
    ListNode node13 = new ListNode(3);
    node11.next = node12;
    node12.next = node13;

    ListNode node21 = new ListNode(5);
    ListNode node22 = new ListNode(6);
    ListNode node23 = new ListNode(6);
//    ListNode node24 = new ListNode(6);
    node21.next = node22;
    node22.next = node23;
//    node23.next = node24;
    
    ListNode node = l.addTwoNumbers(node11,node21);
    while(node != null){
    	System.out.println(node.val);
    	node = node.next;
    	 	
    }
    
    
    
	}

	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln1 = l1, ln2 = l2, head = null, node = null;
        int carry = 0, remainder = 0, sum = 0;
        head = node = new ListNode(0);

        while(ln1 != null || ln2 != null || carry != 0) {
            sum = (ln1 != null ? ln1.val : 0) + (ln2 != null ? ln2.val : 0) + carry;
            carry = sum / 10;
            remainder = sum % 10;
            node = node.next = new ListNode(remainder);
            ln1 = (ln1 != null ? ln1.next : null);
            ln2 = (ln2 != null ? ln2.next : null);
        }
        return head.next;
    }
    


// Definition for singly-linked list.
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }




}