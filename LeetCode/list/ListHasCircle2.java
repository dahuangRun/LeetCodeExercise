package list;

/**
 * ��Ŀ���ж�һ���������Ƿ��л�
 * ˼·����������ָ�����жϣ�һ��ָ��p(ÿ����һ��)��һ��ָ��q(ÿ��������)����������ط꣬��һ���л���
 * 		������ط����q.nextΪ�գ���û�л���
 * 		�ڶ��֣���p = head ��q = head	
 * @author Xia
 *
 */
public class ListHasCircle2 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;

		ListNode p = head;
		ListNode q = head.next;
		while(q != null && p != null && q.next != null){
            p = p.next;
            q = q.next.next;
            if(p == q){
                return true;
            }
        }
        return false;
	}
}
