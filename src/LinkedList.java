public class LinkedList {

    Node head;
    Node curr;

    public LinkedList(){
        this.head = null;
        this.curr = null;
    }

    public void insert(Node newNode){

        if (head == null){
            head = newNode;
            curr = newNode;
        }
        else{
            curr.next = newNode;
            curr = newNode;
        }
    }
    public void traverse(){
        curr = head;
        while (curr != null){
            curr.getInfo();
            curr = curr.next;
        }
    }
}
