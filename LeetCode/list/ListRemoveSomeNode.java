package list;

/**
 * 题目：删除链表中等于给定值 val 的所有节点
 * @author Xia
 *
 */
public class ListRemoveSomeNode {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		
		ListNode pre = dummy;
		ListNode cur = head;

		while (cur != null) {
			if (cur.val == val) {
				pre.next = cur.next;
				cur.next = null;
				cur = pre.next;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return dummy.next;
	}
}
