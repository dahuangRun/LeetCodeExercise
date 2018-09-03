package list;

/**
 * 题目：给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 思路：先利用两个指针，p、q一个走一步；一个走两步。如果相遇，则将走得慢的那个结点重置为头结点，再寻找相遇的位置。			
 * @author Xia
 *
 */
public class ListHasCircleDeleteEntry {
	public ListNode detectCycle(ListNode head) {
		//如果沒有环，则直接返回null
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode p = head;
        ListNode q = head;
        
        while(p != null &&  q != null && q.next != null){
            p = p.next;
            q = q.next.next;
          //找到了p、q相遇的位置，然后将p置为头结点
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
