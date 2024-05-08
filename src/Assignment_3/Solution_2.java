package Assignment_3;

import java.util.Arrays;

public class Solution_2 {
    public static void main(String[] args) {
        String str1 = "SUCCESSION";
        char[] strarr = str1.toCharArray();
        Arrays.sort(strarr);
        int[] intarr = new int[26];
        String result = "";

        for (int i = 0; i < strarr.length; i++) {
            intarr[strarr[i] - 'A']++;
        }
        for (int i = 0; i < intarr.length; i++) {
            if (intarr[i] > 1) {
                char ch = (char) (i + 'A');
                result += ch;
            }
        }
        System.out.print(result);
    }
}

