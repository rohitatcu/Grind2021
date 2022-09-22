package linked_list;

import java.util.Stack;

import linked_list.RemoveNthFromEnd.ListNode;

public class LinkedListPalindrome {

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

	public boolean isPalindrome(ListNode head) {

		if (head == null) {
			return true;
		}
		if (head.next == null) {
			return true;
		}
		ListNode head2 = head;

		Stack<Integer> st = new Stack<Integer>();

		while (head2 != null) {
			st.push(head2.val);
			head2 = head2.next;
		}
		while (head != null) {

			if (head.val != st.pop()) {
				return false;
			}
			head = head.next;

		}
		return true;

	}
}
