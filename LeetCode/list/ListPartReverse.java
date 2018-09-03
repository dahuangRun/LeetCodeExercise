package list;

/**
 * ��Ŀ������Ĳ��ַ�ת��
 * ˼·�����ȱ���ǰm-1�Σ������κεĲ������ҵ���(m-1)�����,��Ϊ��ʼ��ת��ǰ����㡣(�����м���sample)
 * 		��sampleΪ��ʼ����� (n-m) ��,��i��ʱ�����ҵ��Ľ����뵽sample�����next�С�
 * 
 * ���ɣ������������⣬����ÿ�ζ����һ��������ͷ��㡣
 * 		������������⣺ÿ�ν��鶼��cur��㿪ʼ������
 * @author Xia
 *
 */
public class ListPartReverse {
	
	
	public ListNode reverse(ListNode head,int m,int n) {
		//�Ƚ�һ���յ�ͷ���
		ListNode temp = new ListNode(0);
		temp.next = head;
		
		//������Ҫ���¼ӵĿսڵ������������������һ���ǹؼ���
		ListNode sample = temp;
		
		ListNode cur = sample.next;
		//��¼(m-1)��λ��
		int i = 0;
		for ( i = 0; i < m-1; i++) {
			sample = cur;
			cur = cur.next;
		}
		
		
		ListNode pre = cur;
		cur = cur.next;
		ListNode next = null;
		
		for (; i < n -1; i++) {
			next = cur.next;
			cur.next = sample.next;
			sample.next = cur;
			pre.next = next;
			cur = next;
		}
		return temp.next;
	}
}
