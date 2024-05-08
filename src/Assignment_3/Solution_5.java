package Assignment_3;

public class Solution_5 {
    public static char[] sortArray(char[] array) {
        int[] arr = new int[26];
        String result = "";
        char ch = 0;
        for (int i = 0; i < array.length; i++) {
            arr[array[i] - 'A']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ch += (char) (i + 65);
                result += ch;
            }
        }
        return result.toCharArray();
    }

    public static void main(String[] args) {
        String str1 = "HEART", str2 = "EARTH";
        int count = 0;
        char[] str1a = str1.toCharArray();
        char[] str2a = str2.toCharArray();

        char[] sort1 = sortArray(str1a);
        char[] sort2 = sortArray(str2a);

        for (int i = 0; i < sort1.length; i++) {
            if (sort1[i] != sort2[i]) {
                System.out.print("Not Anagram");
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.print("Above strings are anagram");
    }
}