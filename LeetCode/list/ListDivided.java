package list;

/**
 * 题目：分割链表
 * 思路：分别建立两个头结点，一个代表小于x，一个代表大于x。
 * 		利用before和after表示小于x和大于x的部分。
 * 		cur表示在原来的链表中当前节点
 * @author Xia
 *
 */
public class ListDivided {
	public ListNode partition(ListNode head, int x) {
		
		//建立左右的空节点
		ListNode tempLeft = new ListNode(0);
		ListNode tempRight = new ListNode(0);
		
		//利用before和after两个结点
		ListNode before = tempLeft;
		ListNode after = tempRight;
		ListNode cur = head;
		
		while (cur != null) {
			if (cur.val < x) {
				before.next = cur;
				before = cur;
			}else {
				after.next = cur;
				after = cur;
			}
			cur = cur.next;
		}
		//最后将有部分添加到before后面
		before.next = tempRight.next;
		after.next = null;
		
		return tempLeft.next;
	}
}
