package leetCodeExamples;

public class NumberofSegmentsinString {
    public static void main(String[] args) {
        System.out.println(count("Salom men Doniyorman"));
    }
    public static int count(String word) {
        int countWord = 0;
        String[] array = word.split(" ");
        for (int i = 0; i < array.length; i++) {
            countWord++;
        }
        return countWord;
    }
}
