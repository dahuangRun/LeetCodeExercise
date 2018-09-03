package com.hone.SwordOffer016;

/**
 * 题目：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 方法1：利用非递归的思想
 * 		思路：定义一个新的链表表头，然后定义一个负责控制当前节点的cur，每次合理的控制cur的位置。
 * @author Xia
 *
 */
public class MergeTwoLink2 {
	public ListNode Merge(ListNode list1, ListNode list2) {
		//首先来两个判断
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		
		//建立新合并链表的头结点，及当前结点
		ListNode newNode = null;
		//current负责当前节点的位置
		ListNode current = null;
		
		while (list1 != null &&list2 != null) {
			//如果list1.val<list2.val，并且newNode不为空，则current下一个结点指向list1，并且list往后移动一位
			if (list1.val <= list2.val) {
				if (newNode == null) {
					newNode = current = list1;
				}else {
					current.next = list1;
					current = current.next;
				}
				list1 = list1.next;
			}
			else {
				if (newNode == null) {
					newNode = current = list2;
				}else {
					current.next = list2;
					current = current.next;
				}
				list2 = list2.next;
			}
		}
		//如果循环到最后，list1已经为空了，则将list2所有的结点都赋给当前current.next
		//反过来，如果list2已经为空，则将list1所有的结点都赋给当前的current.next
		if (list1 == null) {
			current.next = list2;
		}else {
			current.next = list1;
		}
		return newNode;
	}
}
