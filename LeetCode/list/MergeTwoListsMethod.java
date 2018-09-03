package list;

/**
 * ��Ŀ���ϲ�������������
 * Ҫ�㣺һ��Ҫ����Ŀ���cur��λ�á�
 * @author Xia
 *
 */
public class MergeTwoListsMethod {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                if(head.next == null)
                    head.next = l2;
                cur.next= l2;
                l2 = l2.next;
                cur = cur.next;
            }else{
                if(head.next == null)
                    head.next = l1;
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
        }
        
        cur.next = l1 == null ? l2:l1;
        return head.next;
    }

}
