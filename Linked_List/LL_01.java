package Linked_List;

public class LL_01 {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add - first,Last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;

        }
    }
    public void printList() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node currNode = head;
    while (currNode != null) {
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
    }

    System.out.println("null");
    }
    public static void main(String[] args) {
        LL_01 list=new LL_01();
        list.addFirst("Rohan Verma .");
        list.addFirst("is ");
        list.addFirst("name ");
        list.addFirst("My ");
        list.printList();
    }
}
