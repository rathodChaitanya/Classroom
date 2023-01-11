package datastructure.LL.doubly_LL;

public class CountNo {
    class Node{
        int data;
        Node previous;
        Node next;

        public Node (int data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
        }else{

        }
    }
}
