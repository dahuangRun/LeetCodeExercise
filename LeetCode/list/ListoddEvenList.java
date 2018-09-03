package list;

/**
 * ��Ŀ������һ�������������е������ڵ��ż���ڵ�ֱ�����һ��(�±�)(�ռ临�Ӷ�ӦΪ O(1)��ʱ�临�Ӷ�ӦΪ O(nodes))
 * ˼·����������ָ��pre��cur��preָ��������㡢curָ��ż����㡣
 * 		����һ�α�����cur������������ᵽpre���棬Ȼ��pre = pre.next;cur = cur.next.��ʱcur��ָ��ż�ڵ㣬preָ��ǰ��ڵ��ĩβ.
 * 		�Դ�����ֱ�������е�ż�ڵ㶼��ǰ�˼��ɡ�
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
