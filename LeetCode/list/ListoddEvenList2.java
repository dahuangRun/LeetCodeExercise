package list;

/**
 * ��Ŀ������һ�������������е������ڵ��ż���ڵ�ֱ�����һ��(�±�)
 * ˼·����������ָ��pre��cur��preָ��������㡢curָ��ż����㡣
 * 		�ڶ�����һ��ָ��evenHead��ʾż������ͷ��Ȼ����������ָż��������һ��������������һλ��
 * 		�ٽ�ż�����ָ������������һλ��ֱ�����Ľ�β��;Ȼ���ٺϲ����ɡ�
 * @author Xia
 *
 */
public class ListoddEvenList2 {
	
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while(even != null && even.next != null){
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		
		//���ż�����������������ĺ���
		odd.next = evenHead;
		return head;
	}
}
