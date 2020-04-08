public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode middlePointer = head;
        ListNode lastPointer = head;
        while (lastPointer != null && lastPointer.next != null) {
            middlePointer = middlePointer.next;
            lastPointer = lastPointer.next.next;
        }
        return middlePointer;
    }
}