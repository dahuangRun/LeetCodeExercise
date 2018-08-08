package com.hone.SwordOffer014;

/**
 * 题目：输入一个链表，输出该链表中倒数第k个结点。
 * 思路：1. 首先统计该链表总共有多少个结点
 * 		2. 查找倒数第k个结点，其实就是顺着的count-k个结点
 * 		时间复杂度为O(n)
 * @author Xia
 */
public class PrintKNote {
	public ListNode FindKthToTail(ListNode head,int k) {
		int count = 0;
		ListNode temp = head;
		//首先统计该链表总共有多少个结点
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		//如果k大于总的所有结点，则直接返回null
		if (k > count) {
			return null;
		}
		
		//查找倒数第k个结点，其实就是顺着的count-k个结点
		ListNode res = head;
		for (int i = 0; i < count - k; i++) {
			res = res.next;
		}
		return res;
    }
}
