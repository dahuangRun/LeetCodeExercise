package list;

import java.util.Stack;

/**
 * 题目：两数相加 II (3-4-5-1)+(2-3-1)=3-6-8-2
 * 思路：利用堆栈的先进后出的原理。如果链表为空，则将其值设置为0。
 * 技巧：将最开始额外的头结点设置为dummy.val = 1
 * 		
 * @author Xia
 *
 */
public class ListAdd2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//可以利用栈的先进后出思想
        Stack<ListNode> s1 = new Stack<ListNode>();
        Stack<ListNode> s2 = new Stack<ListNode>();
        while(l1 != null){
            s1.push(l1);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2);
            l2 = l2.next;
        }
      //设置进位
        int carry = 0;
      //这个dummy不一定是没有用的结点
        ListNode dummy = new ListNode(1);
        
        ListNode cur = dummy;
        
        while(!s1.empty() || !s2.empty()){
        	int v1 = 0;
        	int v2 = 0;
        	if (!s1.empty()) {
				v1 = s1.pop().val;
			}
        	if (!s2.empty()) {
        		v2 = s2.pop().val;
        	}
            cur = new ListNode((v1+v2+carry)%10);
            carry = (v1 + v2+carry)/10;
            cur.next = dummy.next;
            dummy.next = cur;
        }
        
		return carry == 1? dummy:dummy.next;
    }
}
