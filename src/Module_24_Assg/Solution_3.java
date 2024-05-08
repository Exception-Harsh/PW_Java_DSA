package Module_24_Assg;

public class Solution_3 {
    public static void main(String[] args) {
        String str1 = "2552";
        String str2 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }

        if (str1.equals(str2))
            System.out.print("2552 is Palindrome");
        else
            System.out.print("2552 is not Palindrome");
    }
}