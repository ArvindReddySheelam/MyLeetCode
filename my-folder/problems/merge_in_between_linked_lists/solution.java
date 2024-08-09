/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //check if list's are empty
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        //traverse list1 till index-1(a-1) since 0 based index
        ListNode list1_front = list1;
        for(int i = 0; i<a-1; i++){
            list1_front = list1_front.next;//Now list1_front at index 2
        }
        //Take list1_rear back that need to be connected with list2 Tail
        ListNode list1_rear = list1_front.next;
        for(int i = a; i<=b; i++){
             list1_rear = list1_rear.next;//Now list1_rear at Tail of list1
        }
        //Take list2 Head and find list2 Tail
        ListNode list2_Head = list2;
        ListNode list2_Tail = list2;

        while(list2_Tail.next != null){
           list2_Tail = list2_Tail.next;
        }
//connect list1_front.next pointer to head of list2 and list2_Tail to list1_rear
        list1_front.next = list2_Head;
        list2_Tail.next = list1_rear;

        return list1;
    }
}