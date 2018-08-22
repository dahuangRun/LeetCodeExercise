package com.hone.SwordOffer056;

/**
 * 题目：删除重复结点
 * 思路：首先可以在链表前面添加一个头结点。防止头结点是重复结点。
 * 		核心：定三个点：Head(新的头)、pre(前结点)、cur(当前工作结点)
 * 			 首先判断当前节点和当前节点的值是否相等，如果相等，则找出相等的最后一个。
 * 			如果不想等，则直接将pre、cur后移。
 * 心得：对于链表中去掉某个结点的操作，可以首先把前一个结点的位置转移，再调整别的结点。
 * @author Xia
 *
 */
public class DeleteDuplicationNote {
	public ListNode deleteDuplication(ListNode pHead){
		//如果原结点只有0或者1个结点，直接返回头结点
		if (pHead == null || pHead.next == null) {
			return pHead;
		}
		
		//为链表添加一个头结点
		ListNode head = new ListNode(-1);
		head.next = pHead;
		
		ListNode pre = head;
		
		ListNode cur = pHead;
		
		while (cur != null) {
			if (cur.next != null&&cur.val == cur.next.val) {
				while (cur.next != null && cur.val == cur.next.val) {
					cur = cur.next;
				}
				pre.next = cur.next;
				cur = cur.next;
			}else {
				pre = cur;
				cur = cur.next;
			}
		}
		return head.next;
	}
}
