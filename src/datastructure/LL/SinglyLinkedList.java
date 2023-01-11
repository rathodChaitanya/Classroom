package datastructure.LL;

public class SinglyLinkedList {


    public Node head = null;

    public void addNode(int data){
        Node new_node = new Node(data);

        if(head==null){
            head = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }else{
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.addNode(1);
        sList.addNode(5);
        sList.addNode(3);
        sList.addNode(8);
        sList.addNode(6);
         sList.display();
    }
}
