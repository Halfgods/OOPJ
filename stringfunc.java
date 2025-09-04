import java.util.*;

public class stringfunc {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> result = new ArrayList<>();

        for (String w : words) {
            boolean placed = false;
            for (List<String> group : result) {
                if (isAnagram(group.get(0), w)) {
                    group.add(w);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(w);
                result.add(newGroup);
            }
        }
        System.out.println(result);
    }

    static boolean isAnagram(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return new String(x).equals(new String(y));
    }
}
