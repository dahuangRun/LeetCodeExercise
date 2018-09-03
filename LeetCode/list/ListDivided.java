package list;

/**
 * ��Ŀ��������
 * ˼·���ֱ������������before��after��С��x����ӵ�before������x����ӵ�after�����after��ͷ���ӵ�before��β�����ɡ�
 * @author Xia
 *
 */
public class ListDivided {
	public ListNode partition(ListNode head, int x) {
		
		//�������ҵĿսڵ�
		ListNode tempLeft = new ListNode(0);
		ListNode tempRight = new ListNode(0);
		
		//��before��after�ֱ��ʾ��������ĵ�ǰ�ڵ�
		ListNode before = tempLeft;
		ListNode after = tempRight;
		ListNode cur = head;
		
		while (cur != null) {
			if (cur.val < x) {
				
				before.next = cur;
				before = cur;
			}else {
				after.next = cur;
				after = cur;
			}
			cur = cur.next;
		}
		//������x�Ľ�����ӵ�С��x�ĺ���
		before.next = tempRight.next;
		after.next = null;
		
		return tempLeft.next;
	}
}
