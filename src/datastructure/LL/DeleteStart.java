package datastructure.LL;

public class DeleteStart {

    public Node head = null;

    public void addNode(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public void deleteNode() {
        Node temp = head;
        if (head == null) {
            head = null;
        } else {
            temp = temp.next;
            head = temp;
        }
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DeleteStart sList = new DeleteStart();
        sList.addNode(1);
        sList.addNode(5);
        sList.addNode(3);
        sList.addNode(8);
        sList.addNode(6);
        System.out.println("Before delete");
        sList.display();
        sList.deleteNode();
        System.out.println("After delete");
        sList.display();
    }
}
