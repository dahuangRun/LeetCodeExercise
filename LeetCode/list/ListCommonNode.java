package list;

/**
 * 题目：编写一个程序，找到两个单链表相交的起始节点。
 * 
 * @author Xia
 *
 */
public class ListCommonNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		ListNode tempa = headA;
		ListNode tempb = headB;
		int a = 0;
		int b = 0;
		
		//第一步：从头开始遍历两个链表，统计两个链表总共有多少结点
		while (tempa != null) {
			a++;
			tempa = tempa.next;
		}
		while (tempb != null) {
			b++;
			tempb = tempb.next;
		}
		//将tempa和tempb都重新置为头结点
		tempa = headA;
		tempb = headB;
		//显然某一个结点走|b - a|步
		if (a > b) {
			for (int i = 0; i < a - b; i++) {
				tempa = tempa.next;
			}
		}else {
			for (int i = 0; i < b - a; i++) {
				tempb = tempb.next;
			}
		}
		//一直往下遍历，直到两点相等为止。
		while (tempa != tempb && tempa!=null && tempb != null) {
			tempa = tempa.next;
			tempb = tempb.next;
		}
		return tempa;
	}
}
