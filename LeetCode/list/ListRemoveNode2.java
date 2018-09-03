package list;

/**
 * ��Ŀ������������ȥ�أ�ɾ���ظ���Ԫ�أ�ֻ�����ظ�Ԫ���е�һ�γ��ֵĽ�㡣 ˼·��
 * ˼·������һ���������ɲ���
 * ˼·�����cur.next == cur,��cur.next.next��ֵ��cur.next����������൱��ɾ����ԭʼ��cur.next
 * @author Xia
 *
 */
public class ListRemoveNode2 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode cur = head;

		while (cur != null) {
			//��������Ҫ���ж�cur.next�Ƿ�Ϊ�գ�Ȼ���ڱȽ�ֵ������˳���ܽ�����
			if (cur.next != null && cur.next.val == cur.val ) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return head;
	}
}
