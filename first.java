import java.util.*;

class A{
    int x;
    int y;
    a(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class first{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        A arr[]=new A[5];
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[i]=new A(a,b);
        }
    }
}