package com.hone.SwordOffer036;

import java.util.HashMap;

/**
 * 题目：输入两个链表，找出它们的第一个公共结点。
 * 思路：利用hashMap的特点
 * @author Xia
 *
 */
public class FindFirstCommonNodeInTwoLink2 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		HashMap<ListNode, Integer> result = new HashMap<ListNode,Integer>();
		while (p1 != null) {
			result.put(p1, null);
			p1 = p1.next;
		}
		while (p2 != null) {
			if (result.containsKey(p2)) {
				return p2;
			}else {
				p2 = p2.next;
			}
		}
		return null;
	}
}
