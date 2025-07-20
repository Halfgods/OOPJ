import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String digitList = "0123456789";
        int alphabets = 0, digits = 0, special = 0, spaces = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;

            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                alphabets++;
            } else if (digitList.indexOf(ch) != -1) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                special++;
            }
        }
        int words = s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Symbols: " + special);
        System.out.println("Blank Spaces: " + spaces);
        System.out.println("Words: " + words);

        sc.close();
    }
}
