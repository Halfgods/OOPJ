public class functenstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(6, 10, "Code");
        sb.delete(6, 10);
        sb.reverse();
        sb.reverse();
        sb.setCharAt(0, 'h');
        sb.deleteCharAt(5);
        sb.ensureCapacity(50);
        sb.trimToSize();
        System.out.println(sb);
    }
}
