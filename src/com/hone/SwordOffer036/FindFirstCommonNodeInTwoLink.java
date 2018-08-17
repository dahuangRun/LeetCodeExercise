package com.hone.SwordOffer036;

/**
 * 题目：输入两个链表，找出它们的第一个公共结点。
 * 思路：用两个指针扫描”两个链表“，最终两个指针到达 null 或者到达公共结点。
 * 		长度相同有公共结点，第一次就遍历到；没有公共结点，走到尾部NULL相遇，返回NULL
 * 		长度不同有公共结点，第一遍差值就出来了，第二遍一起到公共结点；没有公共，一起到结尾NULL。
 * @author Xia
 *
 */
public class FindFirstCommonNodeInTwoLink {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while (p1 != p2) {
			p1 = (p1 == null ? pHead2: p1.next);
			p2 = (p2 == null ? pHead1: p2.next);
		}
		return p1;	
	}
}
