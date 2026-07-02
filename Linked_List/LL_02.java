package Linked_List;

public class LL_02 {
    Node head;
    private int size; 
    LL_02(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
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

    //Delete First 
    public void deleteFirst(){
        if(head==null){
              System.out.println("the list is empty");
        }
        size--;
        head=head.next;
    }
    //Delete Last
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNOde=head.next;//head.next=null->lastnode=null
        while(lastNOde.next!=null){
            lastNOde=lastNOde.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL_02 list=new LL_02();
        list.addFirst("Rohan Verma .");
        list.addFirst("is ");
        list.addFirst("name ");
        list.addFirst("My ");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

    }
}
