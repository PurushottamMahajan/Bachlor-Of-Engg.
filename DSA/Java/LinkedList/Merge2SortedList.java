package LinkedList;

public class Merge2SortedList {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();
        ListNode list=ans;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                ans.next=list1;
                list1=list1.next;
                ans=ans.next;
            }
            else
            {
                ans.next=list2;
                list2=list2.next;
                ans=ans.next;
            }
        }
        ans.next=(list1!=null)?list1:list2;
        return list.next;
    }
}