/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node slowNode = head;
    Node fastNode = head;
    while(slowNode != null && fastNode!=null  && fastNode.next!=null ){
        slowNode = slowNode.next;
        fastNode = fastNode.next.next;
        if(slowNode == fastNode){
            return true;
        }
    }
    return false;
}
