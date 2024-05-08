package Module_24_Assg;

public class Solution_1 {
    public static void main(String[] args) {
        String s1 = "Succession";
        s1 = s1.toUpperCase();
        String s2 = "";
        String ch;

        for (int i = 0; i < s1.length(); i++) {
            ch = "" + s1.charAt(i);
            if(s2.contains(ch))
                continue;
            s2 += ch;
        }
        System.out.print(s2);
    }
}