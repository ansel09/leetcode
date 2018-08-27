public class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { // problem 2.
        int flag = 0;
        ListNode retNode = new ListNode(0);
        ListNode currNode = retNode;
        while(l1 != null || l2 != null || flag == 1){
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;
            int sum = a + b + flag;
            flag = sum / 10;
            currNode.next = new ListNode(sum % 10);
            currNode = currNode.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return retNode.next;
    }	
}