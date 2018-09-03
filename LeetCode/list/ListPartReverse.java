package list;

/**
 * 题目：反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 思路：利用好几个关键的结点：pre、cur、next。
 * 		核心思路是头插法。
 * 
 * @author Xia
 *
 */
public class ListPartReverse {

	public ListNode reverse(ListNode head, int m, int n) {
		// 先建一个空的头结点
		ListNode temp = new ListNode(0);
		temp.next = head;

		// 这里需要把新加的空节点给单独保存起来。这一步是关键。
		ListNode sample = temp;

		ListNode cur = sample.next;
		// 记录(m-1)的位置
		int i = 0;
		for (i = 0; i < m - 1; i++) {
			sample = cur;
			cur = cur.next;
		}
		//利用pre记录当前当前开始翻转结点的前一个结点
		ListNode pre = cur;
		cur = cur.next;
		ListNode next = null;
		
		//每次都将找到的结点插入到sample的后面
		for (; i < n - 1; i++) {
			next = cur.next;
			cur.next = sample.next;
			sample.next = cur;
			pre.next = next;
			cur = next;
		}
		return temp.next;
	}
}
