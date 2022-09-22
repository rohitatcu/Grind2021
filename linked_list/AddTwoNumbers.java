package linked_list;

/**
 * leetcode#2
 * @author rohitgupta
 *
 */
public class AddTwoNumbers {

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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode start1 = new ListNode();
		ListNode start = start1;

		int carry = 0;
		while (l1 != null && l2 != null) {
			int sum1 = l1.val + l2.val + carry;

			int v1 = sum1 / 10;
			int v2 = sum1 % 10;

			start.next = new ListNode(v2);
			start = start.next;
			carry = v1;

			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			int sum1 = l1.val + carry;
			int v1 = sum1 / 10;
			int v2 = sum1 % 10;
			start.next = new ListNode(v2);
			start = start.next;
			carry = v1;
			l1 = l1.next;

		}

		while (l2 != null) {
			int sum1 = l2.val + carry;
			int v1 = sum1 / 10;
			int v2 = sum1 % 10;
			start.next = new ListNode(v2);
			start = start.next;
			carry = v1;
			l2 = l2.next;

		}

		if (carry != 0) {
			start.next = new ListNode(carry);
			start = start.next;
		}
		return start1.next;
	}
}
