package com.hone.SwordOffer015;

/**
 * 题目：输入一个链表，反转链表后，输出新链表的表头。
 * 方法2：定义两个结点：pre,next
 * 
 * @author Xia
 *
 */
public class ReverseListMethod2 {
	public ListNode ReverseList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}

		return pre;
	}
}
