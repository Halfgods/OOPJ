public class charcount {
    public static void main(String[] args) {
        String input = "aaaaabbbadbbbbbasdbbbbdw";
        System.out.println(compress(input));
    }

    static String compress(String s) {
        StringBuffer result = new StringBuffer();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return result.length() < s.length() ? result.toString() : s;
    }
}
