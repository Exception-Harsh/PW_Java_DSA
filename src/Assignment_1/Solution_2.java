package Assignment_1;

public class Solution_2 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i <= (n - 1) / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2 || i == (n - 1) / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
