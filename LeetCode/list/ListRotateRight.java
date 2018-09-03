package list;

/**
 * 题目：给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * 思路：手下统计链表总共有多少个结点。利用k % n 判断需要一定多少个结点，避免k > n的情况。
 * @author Xia
 *
 */
public class ListRotateRight {
	public ListNode rotateRight(ListNode head, int k) {

		if (head == null)
			return null;

		ListNode cur = head;

		//统计总的结点数
		int n = 1;
		while (cur.next != null) {
			n++;
			cur = cur.next;
		}
		
		
		cur.next = head;			

		k = k % n;

		int i = 0;
		
		//遍历到应该移动的位置之前
		for (; i < n - k; ++i) {
			cur = cur.next;
		}

		ListNode newHead = cur.next;
		//��һ������Ҫ��ֵ
		cur.next = null;
		return newHead;
	}
}
