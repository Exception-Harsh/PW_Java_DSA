package Module_24_Assg;

public class Solution_6 {
    public static void main(String[] args) {
        String str1 = "The five boxing wizards jump quickly";
        str1 = str1.replace(" ", "");
        str1 = str1.toUpperCase();

        char[] str1a = str1.toCharArray();
        int count = 0;
        int[] chararr = new int[26];

        for (char c : str1a) {
            chararr[c - 'A']++;
        }

        for (int j : chararr) {
            if (j == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.print("String is Pangram");
        else
            System.out.print("String is not Pangram");
    }
}