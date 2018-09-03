package list;

/**
 * ��Ŀ���ж�һ�������Ƿ�Ϊ�������� 
 * ˼·�����������жϻ��ĵķ�����ջ��������Ŀ�涨����Ҫ��O(1)�ռ临�Ӷȣ���˲��ܲ���ջ��˼·��
 * 		����ʹ�ÿ���ָ��ķ�ʽ��ȡ��������е㣬�����е�֮���ٽ����εĽ�㷭ת���ɡ�
 * 		��Ҫ���������ؼ���㣺pre��next
 * 
 * @author Xia
 *
 */
public class ListPalindrome {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		// Ѱ���м���
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// ��ý�����һ����㣬���ҿ�ʼ����벿�ַ�ת
		ListNode last = slow.next;
		ListNode pre = head;

		//��ת����
		while (last.next != null) {
			ListNode next = last.next;
			last.next = next.next;
			next.next = slow.next;
			slow.next = next;
		}

		//�Ƚ��Ƿ��ǻ�������
		while (slow.next != null) {
			slow = slow.next;
			if (pre.val != slow.val) {
				return false;
			}
			pre = pre.next;
		}
		return true;
	}
}
