import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class search{
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
    public void serch(int z){
        Node temp=head;
        int f=0,c=1;
        while(temp!=null){
            if(temp.data==z){
                f=1;
                c=c+1;
                break;
            }
            temp=temp.next;
        }
        if(f==1){
            System.out.println("Yes at"+c);
        }else{
            System.out.println("No");
        }

    }
    public static void main(String ags[]){
        search obj=new search();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //no of nodes to create
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            obj.insertAtLast(x);
        }
        int s=sc.nextInt();
        obj.serch(s);
    }
    
}
