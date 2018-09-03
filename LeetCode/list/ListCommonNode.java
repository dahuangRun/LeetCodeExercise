package list;

/**
 * ��Ŀ������������ĵ�һ��������㡣
 * 
 * @author Xia
 *
 */
public class ListCommonNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		ListNode tempa = headA;
		ListNode tempb = headB;
		int a = 0;
		int b = 0;
		
		//��һ������ͷ��ʼ������������ͳ�����������ܹ��ж��ٽ��
		while (tempa != null) {
			a++;
			tempa = tempa.next;
		}
		while (tempb != null) {
			b++;
			tempb = tempb.next;
		}
		//��tempa��tempb���»ص�ͷ���
		tempa = headA;
		tempb = headB;
		//�ó���������|a-b|��
		if (a > b) {
			for (int i = 0; i < a - b; i++) {
				tempa = tempa.next;
			}
		}else {
			for (int i = 0; i < b - a; i++) {
				tempb = tempb.next;
			}
		}
		//Ȼ��������ͬ�Ľ��
		while (tempa != tempb && tempa!=null && tempb != null) {
			tempa = tempa.next;
			tempb = tempb.next;
		}
		return tempa;
	}
}
