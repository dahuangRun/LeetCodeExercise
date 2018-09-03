package list;

/**
 * ��Ŀ������������ȥ�أ�ɾ���ظ���Ԫ�أ�ֻ�����ظ�Ԫ���е�һ�γ��ֵĽ�㡣 
 * ˼·������������㣬pre,cur,����Ҳ������⡣
 * @author Xia
 *
 */
public class ListRemoveNode {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode pre = head;
		ListNode cur = null;

		while (pre != null) {
			cur = pre.next;
			if (cur != null && cur.val == pre.val ) {
				pre.next = cur.next;
			} else {
				pre = cur;
			}
		}
		return head;
	}
}
