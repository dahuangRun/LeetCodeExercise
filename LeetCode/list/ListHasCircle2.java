package list;

/**
 * 题目：给定一个链表，判断链表中是否有环。
 * 思路：和第一种方法相同，不过这次是定义p和q都为head
 * 		必须加上条件q.next！=null
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
