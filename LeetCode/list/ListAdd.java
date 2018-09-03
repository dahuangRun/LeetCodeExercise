package list;

/**
 * ��Ŀ���������
 * ˼·����������һ���õ������Ŀ��ʱ���������ʱ���ü����������λ�������
 * 		��ȷ��(1) Ϊ�˱��⴦���׽ڵ�����⣬һ�㶼������һ���յ��׽ڵ㡣
 * 			 (2) �������������õ���λ�������������õ���ǰλ�õ�����
 * @author Xia
 *
 */
public class ListAdd {

	public ListNode addTwoList(ListNode l1, ListNode l2) {

		ListNode p = l1;
		ListNode q = l2;
		ListNode newHead = new ListNode(0);
		ListNode cur = newHead;
		
		int sum = 0;
		int carry = 0;
		while (p != null && q != null) {
			sum = p.val + q.val + carry;
			carry = sum/10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			p = p.next;
			q = q.next;
		}
		
		//���ϳ�����һ������ֱ����ӵ�����
		ListNode temp = p != null ? p : q;
		while(temp != null){
			sum = carry + temp.val;
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			temp = temp.next;
		}
		
		//�ж�����Ƿ��н�λ
		if (carry != 0) {
			cur.next = new ListNode(carry);
		}
		return newHead.next;
	}

}
