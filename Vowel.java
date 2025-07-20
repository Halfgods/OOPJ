import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                switch (ch) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        vowels++;
                        break;
                    default:
                        consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close();
    }
}
