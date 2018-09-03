package list;

/**
 * ��Ŀ����ת����
 * ˼·����������ָ�룬�Ƚ���һ��ָ�������β�ڵ㣬�ٽ������ӵ�ͷ�ڵ�Ӷ��γ�һ���պϵĻ���
 * 		Ȼ���ٽ��ڶ���ָ�������(n-k)��(nΪ�ڵ㳤��)���ڵ����һ����Ϊ�µ�ͷ�ڵ㣬��ǰ�ڵ㼴Ϊβ�ڵ㡣
 * @author Xia
 *
 */
public class ListRotateRight {
	public ListNode rotateRight(ListNode head, int k) {

		if (head == null)
			return null;

		ListNode cur = head;

		int n = 1;
		while (cur.next != null) {
			n++;
			cur = cur.next;
		}
		cur.next = head;			//����һ�����򽫵������ɻ�״������

		k = k % n;

		int i = 0;

		for (; i < n - k; ++i) {
			cur = cur.next;
		}

		ListNode newHead = cur.next;
		//��һ������Ҫ��ֵ
		cur.next = null;
		return newHead;
	}
}
