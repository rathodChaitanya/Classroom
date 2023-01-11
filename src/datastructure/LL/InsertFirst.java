package datastructure.LL;

public class InsertFirst {

    Node head = null;

    public void addStart(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
        }else{
            Node temp = head;

             head = new_node;

            head.next = temp;
        }
    }
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("link list empty");
        }else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        InsertFirst sList = new InsertFirst();
        sList.addStart(1);
        sList.display();

        sList.addStart(2);
        sList.display();

        sList.addStart(3);
        sList.display();

        sList.addStart(4);
        sList.display();
    }
}
