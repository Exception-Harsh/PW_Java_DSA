package Module_24_Assg;

public class Solution_8 {
    public static void main(String[] args) {
        String str1 = "PW SKILLS";
        str1 = str1.replace(" ", "");
        str1 = str1.toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'A']++;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                char ch = (char) (i + 'A');
                System.out.println(ch);
            }
        }
    }
}
