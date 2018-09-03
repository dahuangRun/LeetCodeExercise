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
		//head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
		if (head == null) {
			return null;
		}
		//当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
		//需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head   next1->next2
		//即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
		//所以需要用到pre和next两个节点
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			//先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
			next = head.next;
			//保存完next，就可以让head从指向next变成指向pre了
			head.next = pre;
			//head指向pre后，就继续依次反转下一个节点
			//让pre，head，next依次向后移动一个节点，继续下一次的指针反转
			pre = head;
			head = next;
		}
		return pre;
	}
}
