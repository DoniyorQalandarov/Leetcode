package leetCodeExamples;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        System.out.println(newArray(new String[]{"++X", "++X", "--X"}));
    }

    public static int newArray(String array[]) {
        int sanoq = 0;
        for (String x : array) {
            if (x.charAt(1) == '-') {
                --sanoq;
            }
            if (x.charAt(1) == '+') {
                ++sanoq;
            } else
                return sanoq;
        }
        return sanoq;
    }
}
