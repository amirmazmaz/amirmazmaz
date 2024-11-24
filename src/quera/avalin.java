package quera;
import java.util.Scanner;

public class avalin {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int king=scanner.nextInt();
        int queen=scanner.nextInt();
        int rook=scanner.nextInt();
        int bishop=scanner.nextInt();
        int knight=scanner.nextInt();
        int pawn=scanner.nextInt();
        int kingRequired=1,queenRequired=1,rookRequired=2,bishopRequired=2,knightRequired=2,pawnRequired=8;
        System.out.println((kingRequired-king)+" "+(queenRequired-queen)+" "+(rookRequired-rook)+" "+
                (bishopRequired-bishop)+" "+(knightRequired-knight)+" "+(pawnRequired-pawn));

    }
}