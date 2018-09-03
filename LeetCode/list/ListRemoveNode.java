package list;

/**
 * 题目：给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 思路：给定两个辅助指针，pre，next。
 * 		如果pre.next = p,则将pre.next.next 赋值给pre，就相当删除了pre.next.
 * @author Xia
 *
 */
public class ListRemoveNode {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode pre = head;
		ListNode cur = null;

		while (pre != null) {
			cur = pre.next;
			if (cur != null && cur.val == pre.val ) {
				pre.next = cur.next;
			} else {
				pre = cur;
			}
		}
		return head;
	}
}
