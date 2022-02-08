
public class DequeLinkedList {
    DoublyNode front;
    DoublyNode back;

    void insert_back(int a){
        DoublyNode new_node = new DoublyNode();
        new_node.data = a;

        if (front == null ){
            front = new_node;
            back = new_node;
        }else{
            new_node.prev = back;

            back.next = new_node;

            back = new_node;
        }
    }

    void insert_front(int a){
        DoublyNode new_node = new DoublyNode();
        new_node.data = a;

        if(front == null ){
            front = new_node;
            back = new_node;
        }else{
            new_node.next = front;

            front.prev = new_node;

            front = new_node;
        }
    }

    void remove_front(){
        front = front.next;

    }

    void remove_back(){
        DoublyNode tmp = back;
        back = back.prev;

        back.next = null;
        tmp.prev = null;

    }

    int peek_front(){
        return front.data;
    }


    int peek_back(){
        return back.data;
    }
    public static void main(String[] args) {

        DequeLinkedList q = new DequeLinkedList();
        q.insert_back(10);
        q.insert_back(4);
        q.insert_back(2);
        q.insert_back(5);

        System.out.println(q.peek_front());
        System.out.println(q.peek_back());

        q.remove_back();
        System.out.println(q.peek_back());


    }
}
