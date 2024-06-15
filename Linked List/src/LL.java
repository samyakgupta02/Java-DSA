public class LL {


    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(0);
        list.insertLast(99);
        list.insert(100,3);

        list.display();

    }


    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        //create new node
        Node node = new Node(val);
        //point next of this node ot head
        node.next = head;
        //now update head and make it to the first node
        head  =node;

        if(tail == null){
            tail= head;
        }

        size ++;
    }

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }


    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i< index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;

    }


    public int deteteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size --;
        return val;
    }






    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" --> ");
            temp = temp.next;
        }
            System.out.println("END");
        }


    private class Node{
        private int value;
        private Node next;

        //making a constructor
        public Node(int value){
            this.value = value;
        }
        public Node(int node, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
