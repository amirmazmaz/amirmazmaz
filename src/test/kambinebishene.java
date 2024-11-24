package test;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;
public class kambinebishene {
    public static void main(String[] args) {
        char a,b,c;
        Scanner sc= new Scanner(System.in);
        a= sc.next().charAt(0);
        b= sc.next().charAt(0);
        c= sc.next().charAt(0);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(a==b)
        {
            if(x>=y&&x>=z)
                System.out.println("max : "+x);
            else if (y>=x&&y>=z)
                System.out.println("max : "+y);
            else if (z>=x && z>=y)
                System.out.println("max : "+z);

        }
        else if (a==c) {
          if(x<=y && x<=z)
              System.out.println("min : "+x);
          else if (y<=x && y<=z)
              System.out.println("min : "+y);
          else if (z<=x && z<=y)
              System.out.println("min : "+z);

        }
        else
            System.out.println("None");
    }
}
