package test;
import  java.util.Scanner;
public class adad_aval {
    public static void main(String[] args) {
        int x, n, i = 2;
        boolean flag = true;
        Scanner intput = new Scanner(System.in);
        System.out. println("Enter n: ");
        n = intput.nextInt();

        if ((n == 2) || (n == 3))
            System.out. println(n + " adad ava ast ");
       else if (n == 4)
            System.out. println(n + " adad aval nist ");
       else
       {
            while
            ((flag == true) && (i <= Math.sqrt((double) n))) {
                if (n % i == 0)
                    flag = false;
                i++;
            }
            if (flag == true)
                System.out. println(n + " adad aval ast ");
           else
               System.out. println(n + " adad aval nist ");
        }
    }
}

