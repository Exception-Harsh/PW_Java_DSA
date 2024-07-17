package Module_25_Assg;

import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        StringBuffer str2 = new StringBuffer();

        String[] str = str1.split("_");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            for (int j = str[i].length() - 1; j >= 0; j--) {
                char ch = str[i].charAt(j);
                str2.append(ch);
            }
        }
        System.out.print(str2);
    }
}