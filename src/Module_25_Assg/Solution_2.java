package Module_25_Assg;

import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter the string: ");
        sb.append(scan.nextLine());
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
