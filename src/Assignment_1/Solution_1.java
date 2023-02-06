package Assignment_1;

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 7, option = 1;

        while (option == 1) {
            System.out.println("1: A, 2: B, 3: C, 4: D, 5: E, 6: F, 7: G, 8: H");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 && j != 0 && j != (n - 1) || i != 0 && j == 0 ||i != 0 && j == (n - 1) || i == (n - 1) / 2)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) / 2 && j < (n - 1) || i == (n - 1) && j < (n - 1) || i > 0 && j == (n -1) && i < (n - 1) / 2 || i > (n - 1) / 2 && i < (n - 1) && j== (n - 1))
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                break;

                case 3:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 && j != 0 || i == (n - 1) && j != 0 || i > 0 && i != (n - 1) && j == 0 || i == 1 && j == (n - 1) || i == (n - 2) && j == (n - 1))
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                break;

                case 4:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) && j < (n - 1) || i > 0 && i < (n - 1) && j == (n - 1))
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                break;

                case 5:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == (n - 1) / 2 || i == n - 1 || i < (n - 1) / 2 && j == 0 || i > (n - 1) / 2 && j == 0)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                break;

                case 6:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == (n - 1) / 2 && j <= (n - 1) / 2 || j == 0)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                break;

                case 7:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 && j != 0 || i == (n - 1) && j != 0 || i > 0 && i != (n - 1) && j == 0 || i == 1 && j == (n - 1) || i == (n - 1) / 2 && j >= (n - 1) / 2 || j == (n - 1) && i >= (n - 1) / 2)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;

                case 8:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || j == (n - 1) || i == (n - 1) / 2)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                break;

                default:
                    System.out.println("Enter right choice!");
                break;
            }
            System.out.print("Press 0 to exit or 1 to continue: ");
            option = scan.nextInt();
        }
    }
}
