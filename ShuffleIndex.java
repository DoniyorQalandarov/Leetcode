package leetCodeExamples;

public class ShuffleIndex {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[8]));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder satr = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            satr.setCharAt(indices[i], s.charAt(i));
        }
        return satr.toString();
    }
}

