package quera;

public class sumtowejomle {
    public static void main(String[]args){
        String name= "hassan";
        int age= 45;
        char type= 'A';
        String formattet1 = String.format("Hello! I'm %s and I have %d years old.", name, age);
        String formatted2= String.format("My blood type is %c", type);
        System.out.println(formattet1);
        System.out.println(formatted2);
    }
}
