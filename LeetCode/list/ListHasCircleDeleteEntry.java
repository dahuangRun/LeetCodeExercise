package list;

/**
 * ��Ŀ���ж�һ���������Ƿ��л�,����ɾ��������ڽ�㣬���û�л�����ֱ�ӷ���null
 * ˼·��
 * 				
 * @author Xia
 *
 */
public class ListHasCircleDeleteEntry {
	public ListNode detectCycle(ListNode head) {
        //����]�л�����ֱ�ӷ���null
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode p = head;
        ListNode q = head;
        
        while(p != null &&  q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            //�ҵ���p��q������λ�ã�Ȼ��p��Ϊͷ���
            if(p == q){
                p = head;
                while(p!=q){
                    p = p.next;
                    q = q.next;
                }
                if(p == q){
                    return p;
                }
            }
        }
        return null;
    }
}
