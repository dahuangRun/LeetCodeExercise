package list;

/**
 * 题目：给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 思路：定义两个结点first、second、cur分别对交换结点做辅助使用。
 * @author Xia
 *
 */
public class ListSwapNode {
	public ListNode swapPairs(ListNode head) {
		
		ListNode temp = new ListNode(0);
		temp.next = head;

		ListNode cur = temp;
		ListNode second = null;
		ListNode first = null;
		ListNode last = null;

		while (cur.next != null && cur.next.next != null) {
			first = cur.next;
			second = first.next;
			last = second.next;

			cur.next = second;
			second.next = first;
			first.next = last;

			cur = first;
		}
		return temp.next;
	}
}
