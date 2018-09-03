package list;

/**
 * ��Ŀ���� O(n log n) ʱ�临�ӶȺͳ������ռ临�Ӷ��£��������������
 * ˼·����Ϊ��ĿҪ����O(n log n)ʱ������ɽ�������ˣ�ֻ�й鲢�����١����������ѡ��
 * 		���������ǵ��������ѡ��鲢����ȽϷ��㡣
 * �������ģ���������һ�����  �м���(�����������  fast��slow)��
 * 
 * ��merge�����õ��ݹ�˼�롣
 * @author Xia
 *
 */
public class ListSort2 {
	public ListNode sortList(ListNode head) {
		if(head== null || head.next == null){
            return head;
        }
        
        //��Ŀ��ʱ�临�Ӷ���Ҫ����˲��ù鲢����ķ�ʽ
        //����Ѱ��������е�
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;            //��¼�е��ǰһ�����
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //�ҵ��е������ָ��������
        pre.next = null;
        return merge(sortList(head),sortList(slow));        
    }
    
    
    //����һ��merge����
    public ListNode merge(ListNode l1,ListNode l2){
        
        //����һ��������ͷ���
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null)
            cur.next = l2;
        if(l2 == null)
            cur.next = l1;
        return dummy.next;
    }
    
}
