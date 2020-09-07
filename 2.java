#2 两数相加
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodes=null;
        ListNode temps=null;
        int j=0;
        int add=0;
        while(true)
        {
            int tempval=0;
            if(l1==null&&(l2!=null))
            {
                tempval=l2.val+add;
                l2=l2.next;

            }
            if(l2==null&&l1!=null)
            {
                tempval=l1.val+add;
                l1=l1.next;

            }
            if(l1!=null&&l2!=null){

                tempval=l1.val+l2.val+add;
                l1=l1.next;
                l2=l2.next;
            }

            if(tempval>=10)
            {
                tempval=tempval-10;
                add=1;
            }
            else
                add=0;
            ListNode temp=new ListNode(tempval);
            if(j==0)
                nodes=temp;
            else
                temps.next = temp;
            temps=temp;
            j++;
            if(l1==null&&l2==null) {
                if(add==1)
                {
                    ListNode temp1=new ListNode(1);
                    temps.next=temp1;
                }
                break;
            }
        }
//        if(l1==null) {
//            temps.next = l2;
//        }
//        if(l2==null)
//            temps.next=l1;

        return nodes;
    }
}
