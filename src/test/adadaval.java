package test;
public class adadaval {
    public static void main(String[] args) {
        for( int num=0;num<20;num++)
            if (isprime(num))
                System.out.println(num);
    }
    static boolean isprime(int number){
        if (number<2)
            return false;
        for(int i=2;i<number;i++)
        if(number%i==0)
            return false;
        return true;
    }
}
