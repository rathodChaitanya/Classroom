package datastructure.LL;

public class NodeCount {

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

    public int cout(){
        Node temp = head;
        int c =0;
        if(head == null){
            c = 1;
        }else{
            while(temp != null){
                c++;
                temp = temp.next;
            }
        }
        return c;
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
        NodeCount nc = new NodeCount();
        nc.addNode(4);
        nc.addNode(7);
        nc.addNode(5);
        nc.addNode(9);
        nc.addNode(6);
        System.out.println("count of element :"+nc.cout());
        System.out.println();
        nc.display();
    }
}
