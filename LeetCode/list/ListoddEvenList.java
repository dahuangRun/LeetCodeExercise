package list;

/**
 * 题目：给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 思路：使用两个指针来做，pre指向奇节点，cur指向偶节点，然后把偶节点cur后面的那个奇节点提前到pre的后面，
 * 		然后pre和cur各自前进一步，此时cur又指向偶节点，pre指向当前奇节点的末尾，以此类推直至把所有的偶节点都提前了即可。
 * @author Xia
 *
 */
public class ListoddEvenList {
	
	public ListNode oddEvenList(ListNode head) {
		
		if (head == null || head.next == null)
			return head;
		
		ListNode pre = head;
		ListNode cur = pre.next;
		ListNode next = null;
		while (cur != null && cur.next != null) {
			next = pre.next;
			pre.next = cur.next;
			cur.next = cur.next.next;
			pre.next.next = next;
			cur = cur.next;
			pre = pre.next;
		}
		return head;
	}
	
	
	
}
