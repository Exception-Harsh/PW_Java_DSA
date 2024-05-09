package Module_24_Assg;

public class Solution_7 {
    public static void main(String[] args) {
        String str1 = "Harsh Singh";
        str1 = str1.toUpperCase();
        str1 = str1.replace(" ", "");
        int flag = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length() - i; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    flag++;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.print("It does contain all unique characters");
        else
            System.out.print("It does not contain all unique characters");
    }
}
