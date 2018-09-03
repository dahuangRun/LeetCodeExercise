package com.hone.SwordOffer003;

import java.util.ArrayList;

/**
 * 题目：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。 
 * 第二种方法：可以利用递归。
 * 
 * @author Xia
 */
public class PrintArrayList2 {
	ArrayList<Integer> res = new ArrayList<>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode != null) {
			this.printListFromTailToHead(listNode.next);
			res.add(listNode.val);
		}
		return res;
	}
}
