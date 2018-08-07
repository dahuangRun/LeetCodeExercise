package com.hone.SwordOffer003;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。 
 * 可以利用栈的先进后出的原理。
 * 
 * @author Xia
 */
public class PrintArrayList {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> res = new Stack<>();
		ArrayList<Integer> temp = new ArrayList<>();
		ListNode t = listNode;
		while (t != null) {
			res.push(t.val);
			t = t.next;
		}
		while (!res.isEmpty()) {
			temp.add(res.pop());
		}
		return temp;
	}
}
