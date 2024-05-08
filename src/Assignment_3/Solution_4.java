package Assignment_3;

public class Solution_4 {
    public static void main(String[] args) {
        String str1 = "Harsh Singh is studying Java!!?", str2 = "", ch = "";
        str1 = str1.toUpperCase();
        str1 = str1.replace(" ", "");

        //removing duplicates
        for (int i = 0; i < str1.length(); i++) {
            ch = "" + str1.charAt(i);
            if (str2.contains(ch))
                continue;
            str2 += ch;
        }
        System.out.println(str2);

        int consonant = 0, vowel = 0, special_sym = 0;

        for (int i = 0; i < str2.length(); i++) {
            char ch1 = str2.charAt(i);
            if (ch1 == 'A'|| ch1 == 'E'|| ch1 == 'I'|| ch1 == 'O'|| ch1 == 'U')
                vowel++;
            else if (ch1 == '!'|| ch1 == '@'|| ch1 == '#'|| ch1 == '$'|| ch1 == '%'|| ch1 == '&'|| ch1 == '*')
                special_sym++;
            else
                consonant++;
        }
        System.out.print("Vowel: " + vowel + "\nConsonant: " + consonant + "\nSpecial Symbols: " + special_sym);
    }
}