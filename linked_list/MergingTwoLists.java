package linked_list;

import linked_list.RemoveNthFromEnd.ListNode;

/**
 * leetcide21
 * @author rohitgupta
 *
 */
public class MergingTwoLists {

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
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
	
        ListNode start1 = new ListNode();
                ListNode start = start1;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                start.next = list1;
                list1 = list1.next;
                start = start.next;
            }else{
                 start.next = list2;
                list2 = list2.next;
                start = start.next;
            }
        }
        if(list1 != null){
            start.next = list1;
        }else{
            start.next = list2;
        }
        return start1.next;
    }
}
