package test;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
public class chapseadad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if((b%2==0 && c%2==0 )||(c%2==0) )
        System.out.println("good");
         else
        System.out.println("bad");
    }
}
