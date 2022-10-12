import java.util.ArrayList;

public class Test {
    static class CustomeStack{
         static ArrayList<Integer> list = new ArrayList<>();
         // checking weather arraylist isempty
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        // push data into arraylist
        public static void push(int data){
            list.add(data);
        }
        // pop data
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
         int top = list.get(list.size()-1);
         list.remove(list.size()-1);
         return top;
        }
        // peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }


        public static void main(String[] args) {
            CustomeStack c = new CustomeStack();
            c.push(10);
            c.push(20);
            c.push(50);

            while (!isEmpty()){
                System.out.println(c.peek());
                c.pop();
            }
        }
    }
}

