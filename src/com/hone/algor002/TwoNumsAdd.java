package com.hone.algor002;


/**
 * 1 两数之和 https://leetcode-cn.com/problems/add-two-numbers/description/ 
 *   两个链表的相加
 * 
 * @author Xia
 *
 */
public class TwoNumsAdd {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//建一个链表的头
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1,q = l2,cur = dummyHead;
		//设置用于进位数
		int carry = 0;
		while (p != null&& q!= null) {
			//逐一获取链表的元素，如果到达链表的尾部，则将其置于0
			int x = (p!=null) ? p.val:0; 
			int y = (q!=null) ? q.val:0; 
			int sum = carry + x + y;
			//取商
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			//当前指针指向下一个
			cur = cur.next;
			if (p != null) 
				p = p.next;
			if (q != null) 
				q = q.next;
		}
		if (carry > 0) {
			cur.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
	//在主函数中读入链表，注意需要单独将链表的头给提取出来
	public static void main(String[] args) {
		int[] num1 = { 2,4,3 };
		int[] num2 = { 5,6,4 };
		ListNode l1 = new ListNode(num1[0]);
		ListNode l2 = new ListNode(num2[0]);
		ListNode cur = l1;
		for (int i = 1; i < num1.length; i++) {
			cur.next = new ListNode(num1[i]);
			cur = cur.next;
		}
		ListNode cur2 = l2;
		for (int i = 1; i < num2.length; i++) {
			cur2.next = new ListNode(num2[i]);
			cur2 = cur2.next;
		}
		ListNode res = new TwoNumsAdd().addTwoNumbers(l1, l2);
		while (res!=null) {
			System.out.print(res.val+" -> ");
			res = res.next;
		}
	}
	
	

}
