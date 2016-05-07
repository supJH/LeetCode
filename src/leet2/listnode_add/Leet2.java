package leet2.listnode_add;


public class Leet2{

	public static void main(String... args){
		Leet2 l = new Leet2();

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
        
        ListNode node = null;
        if(l1 != null || l2 != null){   
          int extra = 0;
          int val1 = (l1 == null) ? 0 : l1.val;
          int val2 = (l2 == null) ? 0 : l2.val;    
          int result = val1 + val2;   
          if(result > 9){
            result = result-10;
            extra = 1;
          }      
          node = new ListNode(result);
          l1 = (l1 != null) ? l1.next : null;
          l2 = (l2 != null) ? l2.next : null;
          if(l1 != null){
        	  l1.val = l1.val + extra;        	          	  
          }else if(l1 == null && l2 != null){
        	  l2.val += extra;
          }else if(l1 == null && l2 ==null && extra==1){
        	  l1 = new ListNode(1);        	  
          }
          node.next = addTwoNumbers(l1,l2);                                     
        } 
        return node;
    }



// Definition for singly-linked list.
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }




}