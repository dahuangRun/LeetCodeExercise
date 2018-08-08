package com.hone.SwordOffer014;

/**
 * 题目：输入一个链表，输出该链表中倒数第k个结点。
 * 其实核心也是顺着的(count-k)
 * @author Xia
 */
public class PrintKNote2 {
	public ListNode FindKthToTail(ListNode head, int k) {
		ListNode p, q;
		p = q = head;
		int i = 0;
		for (; p != null; i++) {
			if (i >= k)
				q = q.next;
			p = p.next;
		}
		return i < k ? null : q;
	}
}
