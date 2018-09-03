package list;

/**
 * ��Ŀ��ɾ�������е�����n����㡣
 * ˼·�����Բ���������㣬����һ������� (n-1) ��,Ȼ����������ͷ������������ߵ��Ǹ����Ϊ�գ���˵�������������ĩ�ˡ�
 * 		��һ������ߵ���λ�ü�ΪĿ������һ��λ�á�
 * @author Xia
 *
 */
public class RemoveNthFromEndMethod {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode temp = new ListNode(0);
	        temp.next = head;
	        
	        ListNode p = temp;
	        ListNode q = temp;
	        int i = 0;
	        for(; p != null ;i++){
	            if(i > n){
	                q = q.next;
	            }
	            p = p.next;
	        }   
	        
	        q.next = q.next.next;
	        return temp.next;
	        
	    }
}
