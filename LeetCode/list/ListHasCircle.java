package list;

/**
 * ��Ŀ���ж�һ���������Ƿ��л�
 * ˼·����������ָ�����жϣ�һ��ָ��p(ÿ����һ��)��һ��ָ��q(ÿ��������)����������ط꣬��һ���л���
 * 		������ط����q.nextΪ�գ���û�л���
 * 		��һ�ֽ�p = head��q = head.next
 * @author Xia
 *
 */
public class ListHasCircle {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;

		ListNode p = head;
		ListNode q = head.next;
		while (q != p) {
			if (q == null || q.next == null) {
				return false;
			}
			p = p.next;
			q = q.next.next;
		}
		return true;
	}
}
