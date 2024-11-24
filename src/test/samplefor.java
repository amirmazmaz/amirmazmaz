package test;
import java.util.Arrays;
import java.util.Scanner;
public class samplefor {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       for (int i=1;;i++){
           if (i>n)break;
           if (i%2==0)continue;
           if(i%3!=0)
               continue;
           System.out.println(i);
            }
    }
}
