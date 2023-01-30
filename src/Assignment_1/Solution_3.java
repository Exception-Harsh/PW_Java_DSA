package Assignment_1;

public class Solution_3 {
    public static void main(String[] args) {
        int row = 14;
        for (int i = 1; i <= row; i++) {
            if (i == 1 || i == 14) {
                for (int j = 1; j <= row; j++) {
                    System.out.print("*");
                }
            } else if (i == 2) {
                for (int j = 1; j <= row; j++) {
                    if (j == 7)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            } else if (i == 3) {
                for (int j = 1; j <= row; j++) {
                    if (j < 6 || j > 8)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else if (i == 4) {
                for (int j = 1; j <= row; j++) {
                    if (j < 5 || j > 9)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else if (i == 5) {
                for (int j = 1; j <= row; j++) {
                    if (j < 4 || j > 10)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else if (i == 6) {
                for (int j = 1; j <= row; j++) {
                    if (j < 3 || j > 11)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else if (i == 7) {
                for (int j = 1; j <= row; j++) {
                    if (j == 1 || j > 12)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else if (i > 7) {
                for (int j = 1; j <= row; j++) {
                    if (j == 1 || j == 14)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
Given Pattern
 **************
 ****** *******
 *****   ******
 ****     *****
 ***       ****
 **         ***
 *           **
 *            *
 *            *
 *            *
 *            *
 *            *
 *            *
 **************
 */
