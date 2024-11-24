package test;
import java.util.Scanner;
public class tamrin1 {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt(), maximum=0;
    maximum=a;
    if (b>maximum)
        maximum=b;
    if(c>maximum)
        maximum=c;
    System.out.println(maximum);
    }
}
