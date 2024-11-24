package test;
import java.util.Scanner;
public class mogayesedoadd {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0)
            System.out.println("Your Number is Negative");
        else if (n < 10)
            System.out.println("Your Number is between 0, 9");
        else if (n < 20)
            System.out.println("Your Number is between 10, 19");
        else if (n < 30)
            System.out.println("Your Number is between 20, 29");
        else
            System.out.println("Your Number is greater than or equal to 30");

    }
}
