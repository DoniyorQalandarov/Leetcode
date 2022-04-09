package leetCodeExamples;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"Hello World","Hello Doniyor and Java"}));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max(max,sentences[i].split(" ").length);
        }
        return max;
    }
}
