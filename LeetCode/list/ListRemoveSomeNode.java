package list;

/**
 * ��Ŀ��ɾ�������е��ڸ���ֵ val �����нڵ㡣
 * ˼·������������㣺pre��cur(����cur��ʾ���ڱȽϵĽ�㣬pre��ʾcurǰһ�����)
 * 
 * @author Xia
 *
 */
public class ListRemoveSomeNode {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode cur = head;

		while (cur != null) {
			if (cur.val == val) {
				pre.next = cur.next;
				cur.next = null;
				cur = pre.next;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return dummy.next;
	}
}
