package list;

/**
 * 题目：给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 思路：用两个奇偶指针分别指向奇偶节点的起始位置，另外需要一个单独的指针evenhead来保存偶节点的起点位置，
 * 		然后把奇节点的指向偶节点的下一个(一定是奇节点)，此奇节点后移一步，
 * 		再把偶节点指向下一个奇节点的下一个(一定是偶节点)，此偶节点后移一步，
 * 		以此类推直至末尾，此时把分开的偶节点的链表连在奇节点的链表后即可，
 * @author Xia
 *
 */
public class ListoddEvenList2 {
	
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while(even != null && even.next != null){
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		
		//���ż�����������������ĺ���
		odd.next = evenHead;
		return head;
	}
}
