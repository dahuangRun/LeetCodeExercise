package list;

/**
 * ��Ŀ����������в�������
 * ˼·����ʵ�ʵ����������У�����ʹ��ǰ�벿���Ѿ�����õ����һ��Ԫ�ؿ�ʼ�Ƚϡ�������Ϊ���ǵ�����ֻ�ܹ���ǰ����Ƚϡ�
 * 		��ˣ����ǿ��Խ�����������㣺pre(����õĲ��ֵ����һ�����)��cur(��ǰ��Ҫ�ȽϵĽ��)��next(��ǰ��Ҫ�ȽϽ�����һ�����)
 * @author Xia
 *
 */
public class ListInsertSort {
	public ListNode insertionSortList(ListNode head) {
		// ���һ��������ͷ���
		ListNode temp = new ListNode(0);
		temp.next = head;
		if (head == null)
			return null;

		ListNode pre = head; // ����õ����һ�����
		ListNode cur = head.next; // ��������ĵ�ǰ�ڵ�
		ListNode next = null; // ��ǰ�ڵ����һ�����

		while (cur != null) {
			// �����ǰ�ڵ��valС���Ѿ�����õ����һ����㣬��ʼѰ�Һ��ʵ�λ�ý���,��������һ��Ԫ�ض�����Ƚ���һ��
			if (cur.val < pre.val) {
				next = cur.next;

				// ���Ѿ�����õĽ���ͷ��ʼѰ��
				ListNode cur2 = temp.next;
				ListNode temp2 = temp; // ��¼cur2��ǰһ�����

				while (cur.val > cur2.val && cur2 != pre) {
					temp2 = cur2;
					cur2 = cur2.next;
				}

				// ����ҵ���һ��λ��ʹ��(cur.val<pre.val && cur.val > cur2.val),��ʼ����
				temp2.next = cur;
				cur.next = cur2;
				pre.next = next;
				cur = next;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}

		return temp.next;
	}
}
