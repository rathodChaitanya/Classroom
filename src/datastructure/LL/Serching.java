package datastructure.LL;

public class Serching {

    Node head = null;

    public void addNode(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
        }else{
            new_node.next = head;
            head = new_node;
        }
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
        }else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void search(int data){
        Node temp = head;
        int key = data;
        boolean b = false;
        while(temp != null){
            if(temp.data == key){
                b=true;
                break;
            }
            temp = temp.next;
        }
       if(b){
           System.out.println("no present");
       }else{
           System.out.println("no not present");
       }
    }

    public static void main(String[] args) {
        Serching s = new Serching();
        s.addNode(1);
        s.addNode(5);
        s.addNode(3);
        s.addNode(8);
        s.addNode(6);
        s.search(9);
        s.search(3);
    }

}
