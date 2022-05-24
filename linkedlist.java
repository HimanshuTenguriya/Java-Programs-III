class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class first{
    public static void main(String[] args) {
        Node head=null;
        Node n1=new Node(5);
        head=n1;
        Node n2=new Node(10);
        head=n2;
        Node n3=new Node(15);
        head=n3;
        System.out.print(head.next.next.data);
        }
    }
