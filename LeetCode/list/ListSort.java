package list;

/**
 * 题目：在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * 对于链表的排序：通常的时间复杂度在O(n log n)内的一般有快速排序，归并排序，堆排序。
 * 
 * 技巧：利用快慢结点寻找中间结点的位置。
 * @author Xia
 *
 */
public class ListSort {
	public ListNode sortList(ListNode head) {
		if(head== null || head.next == null){
            return head;
        }
        
        //题目对时间复杂度有要求，因此采用归并排序的方式
        //首先寻找链表的中点
        ListNode slow = head;
        ListNode fast = head;
        
        ListNode pre = head;            //记录中点的前一个结点
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //找到中点后将链表分割成两部分
        pre.next = null;
        return merge(sortList(head),sortList(slow));        
    }
    
    
    //定义一个merge函数
    public ListNode merge(ListNode l1,ListNode l2){
        
       if( l1 == null)
           return l2;
        if(l2 == null)
            return l1;
        
        if(l1.val < l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else{
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }
}
