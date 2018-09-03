package list;

/**
 * ��Ŀ���������ڵ�������㡣
 * ˼·�����ǿ��Զ����ĸ���㡣cur��first��second��Last
 * 		����first��second�ֱ��ʾ��Ҫ�����������㡣
 * 		cur��ʾ��Ҫ������ǰ��һ����
 * 		last��ʾ��Ҫ������ĺ���һ����
 * ��һ������ֻ�Ƕ��������㣬û�аѽ���֮��ĵ���ν���ȥ��
 * @author Xia
 *
 */
public class ListSwapNode {
	public ListNode swapPairs(ListNode head) {
		ListNode temp = new ListNode(0);
		temp.next = head;

		ListNode cur = temp;
		ListNode second = null;
		ListNode first = null;
		ListNode last = null;

		while (cur.next != null && cur.next.next != null) {
			first = cur.next;
			second = first.next;
			last = second.next;

			cur.next = second;
			second.next = first;
			first.next = last;

			cur = first;
		}
		return temp.next;
	}
}
