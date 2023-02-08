public class test {
    public static void main(String[] args) {
        int row_1 = 3, col = 5, row_2 = 2;
        for (int i = 1; i <= row_1; i++) {
            for (int j = 1; j <= row_2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < col; j++) {
                System.out.print("*");
            }
            for (int j = row_1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
