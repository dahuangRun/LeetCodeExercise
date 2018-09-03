package com.hone.SwordOffer015;

/**
 * 题目：输入一个链表，反转链表后，输出新链表的表头。
 * 方法1：定义四个结点：newHead,current,tmp,pre
 * 
 * @author Xia
 *
 */
public class ReverseListMethod {
	public ListNode ReverseList(ListNode head) {
		
		if (head == null) {
			return null;
		}

		ListNode newHead = null;
		ListNode current = head;
		ListNode tmp = null;
		ListNode pre = null;

		while (current != null) {
			tmp = current.next;
			current.next = pre;
			if (tmp == null)
				newHead = current;
			pre = current;
			current = tmp;
		}
		return newHead;
	}
}
