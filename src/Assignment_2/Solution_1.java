package Assignment_2;

import java.util.*;

public class Solution_1 {
    static String removeDuplicate(char[] str, int strSize) {
        int index = 0;

        for (int i = 0; i < strSize; i++)
        {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = scan.nextLine();
        char[] str1 = str.toCharArray();
        System.out.println(removeDuplicate(str1, str1.length));
    }
}
