package list;

/**
 * 题目：给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 思路：利用一个指针
 * @author Xia
 *
 */
public class ListRemoveNode2 {
	public ListNode deleteDuplicates(ListNode head) {
		
		if (head == null) {
			return null;
		}
		
		ListNode cur = head;

		while (cur != null) {
			//如果pre.next = p,则将pre.next.next 赋值给pre，就相当删除了pre.next.
			if (cur.next != null && cur.next.val == cur.val ) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return head;
	}
}
