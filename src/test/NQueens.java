package test;
public class NQueens {

    private static final int N = 8; // تعداد وزیرها (8 وزیر)

    // متد برای چاپ کردن صفحه شطرنج
    public static void printBoard(char[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // متد برای بررسی اینکه آیا می‌توان وزیر را در محل (row, col) قرار داد یا نه
    public static boolean isSafe(char[][] board, int row, int col) {
        // بررسی ستون
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // بررسی قطر چپ بالا
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // بررسی قطر راست بالا
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // متد حل مسئله هشت وزیر با استفاده از بازگشت
    public static boolean solveNQueens(char[][] board, int row) {
        if (row >= N) {
            return true; // اگر همه ردیف‌ها حل شدند
        }

        // تلاش برای قرار دادن وزیر در هر ستون از ردیف فعلی
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) { // اگر محل امن بود
                board[row][col] = 'Q'; // وزیر را قرار می‌دهیم

                // ادامه به قرار دادن وزیر در ردیف بعدی
                if (solveNQueens(board, row + 1)) {
                    return true;
                }

                // اگر قرار دادن وزیر موفق نبود، وزیر را برمی‌داریم
                board[row][col] = 'X';
            }
        }

        return false; // اگر نتوانستیم وزیر را در هیچ ستونی قرار دهیم
    }

    public static void main(String[] args) {
        // ایجاد صفحه شطرنج خالی
        char[][] chessBoard = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                chessBoard[i][j] = 'X'; // پر کردن با 'X' (خانه خالی)
            }
        }

        // حل مسئله و چاپ نتیجه
        if (solveNQueens(chessBoard, 0)) {
            printBoard(chessBoard); // چاپ صفحه نهایی
        } else {
            System.out.println("راه حلی وجود ندارد.");
        }
    }
}