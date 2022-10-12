public class CustomeList {
    Node head;
    private int size;
    CustomeList(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // addFirst
    public void addFirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    //addLast
    public void addLast(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public void add(int position, String data) {
        Node newnode = new Node(data);
        if (position == 1) {
            addFirst(data);
            return;
        }
        Node currNode = head;
        int count = 1;
        while (count < position - 1) {
            count++;
            currNode = currNode.next;
        }
        newnode.next = currNode.next;
        currNode.next = newnode;
    }
    //print
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    //Deleting first element
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size --;
        head = head.next;
    }
    // delete from last
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size --;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    // delete in between
    public String delete(int position){
        if(head == null){
            System.out.println("list is empty");
        }
        if(position == 1) {
            deleteFirst();
        }
        Node currNode = head;
        Node previous = null;
        int count = 1;
        while (count < position -1) {
            count++;
            previous = currNode;
            currNode = currNode.next;
        }
        previous.next = currNode.next;
        currNode.next = null;
        return currNode.data;

        }
    public int sizeoflist(){
        return size;
    }



    public static void main(String[] args) {
        CustomeList ll = new CustomeList();
        ll.addFirst("this");
        ll.addLast("is");
        ll.addLast("a");
        ll.addLast("list");
        ll.printList();
        ll.deleteFirst();
        ll.deleteLast();
        ll.add(3,"30");
        ll.printList();
        ll.delete(3);
        ll.printList();
        System.out.println(ll.sizeoflist());

    }
}
