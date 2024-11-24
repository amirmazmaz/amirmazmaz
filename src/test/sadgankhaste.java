package test;
import java.util.Scanner;
public class sadgankhaste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // برعکس کردن اعداد
        int reversedNumber1 = reverseNumber(number1);
        int reversedNumber2 = reverseNumber(number2);

        // مقایسه اعداد برعکس شده و چاپ نتیجه
        if (String.valueOf(reversedNumber1).equals(String.valueOf(reversedNumber2))) {
            System.out.println(reversedNumber1 + " = " + reversedNumber2);
        } else if (reversedNumber1 < reversedNumber2) {
            System.out.println(reversedNumber1 + " < " + reversedNumber2);
        } else {
            System.out.println(reversedNumber1 + " > " + reversedNumber2);
        }
    }

    // تابع برعکس کردن یک عدد
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
