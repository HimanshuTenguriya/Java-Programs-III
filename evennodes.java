import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class evennodes{
    Node head;
    
    public void insertAtLast(int x){
        Node n=new Node(x);
        if(head==null){
            head=n;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void print(int z){
        int c=0;
        Node temp=head;
        while(temp!=null){
            c++;
            if(c%2==0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }

    }
    public static void main(String ags[]){
        evennodes obj=new evennodes();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //no of nodes to create
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            obj.insertAtLast(x);
        }
        int s=sc.nextInt();
        obj.print(s);
    }
    
}
