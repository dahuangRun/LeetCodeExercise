package com.hone.SwordOffer036;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目：输入两个链表，找出它们的第一个公共结点。
 * 思路：利用Set的特点，因为Set每次只保存独一无二的元素。
 * @author Xia
 *
 */
public class FindFirstCommonNodeInTwoLink3 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		Set<ListNode> result = new HashSet<ListNode>();
		while (p1 != null) {
			result.add(p1);
			p1 = p1.next;
		}
		while (p2 != null) {
			if (result.contains(p2)) {
				return p2;
			}else {
				p2 = p2.next;
			}
		}
		return null;
	}
}
