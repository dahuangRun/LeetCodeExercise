package list;

/**
 * 题目：两数相加(给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表)
 * 思路：可以通过创建新的头结点的方式。注意利用 % 和 / 来处理余数和进位数。
 * @author Xia
 *
 */
public class ListAdd {

	public ListNode addTwoList(ListNode l1, ListNode l2) {

		ListNode p = l1;
		ListNode q = l2;
		ListNode newHead = new ListNode(0);
		ListNode cur = newHead;
		
		int sum = 0;
		int carry = 0;
		while (p != null && q != null) {
			sum = p.val + q.val + carry;
			carry = sum/10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			p = p.next;
			q = q.next;
		}
		
		//将位数长的那部分直接返回。
		ListNode temp = p != null ? p : q;
		while(temp != null){
			sum = carry + temp.val;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			temp = temp.next;
		}
		
		//最后还得判断是否有进位
		if (carry != 0) {
			cur.next = new ListNode(carry);
		}
		return newHead.next;
	}

}
