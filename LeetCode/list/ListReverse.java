package list;

/**
 * ��Ŀ����ת����
 * 
 * @author Xia
 *
 */
public class ListReverse {
	
	/**
	 * ������д��
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		 //����ͷ�巨��ת����
        ListNode dummy = null;
        
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
	}
	
	/**
	 * ���õݹ�ķ���
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head){
		return null;
		
	}
	
}
