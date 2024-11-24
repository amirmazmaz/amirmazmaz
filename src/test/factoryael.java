package test;
import  java.util.Scanner;
public class factoryael {
    public  static  void  main(String[] args) {
        int x, n, fact = 1;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }

}


