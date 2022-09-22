package linked_list;

import linked_list.AddTwoNumbers.ListNode;

/**
 * leetcode#19
 * @author rohitgupta
 *
 */
public class RemoveNthFromEnd {

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
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
	     
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        
        ListNode head1 = head;
        ListNode head2 = head;
        ListNode head3 = head;

        
        int val=1;
        while(val <= n){
            head2 = head2.next;
            val++;
        }
        if(head2 == null){
            return head3.next;
        }
        
        while(head2.next != null){
            head1=head1.next;
            head2=head2.next;
        }
        head1.next = head1.next.next;
        return head3;
    }
}
