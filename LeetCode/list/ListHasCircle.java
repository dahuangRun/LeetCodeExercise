package list;

/**
 * 题目：给定一个链表，判断链表中是否有环。
 * 思路：利用两个指针p、q;p(每次走一步)、q(每次走两步)。但是这一步p定义在头部，q定义在头部的后一个节点。
 * 		如果最后q.next = null，则表示没有环。
 * 		定义p = head和q = head.next
 * @author Xia
 *
 */
public class ListHasCircle {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;

		ListNode p = head;
		ListNode q = head.next;
		while (q != p) {
			if (q == null || q.next == null) {
				return false;
			}
			p = p.next;
			q = q.next.next;
		}
		return true;
	}
}
