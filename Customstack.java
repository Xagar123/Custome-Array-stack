public class Customstack {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next = null;
        }
    }
    static class Stacknew{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            // if node is alredy created then new node is going to point to the next to the head node
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            //first we will check out stack is empty or not
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    public static void main(String[] args) {
        Stacknew s = new Stacknew();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while (!isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    }
}
