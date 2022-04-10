package leetCodeExamples;

public class SumClosest {
    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 3, 3, 3}, 3));
    }

    public static int count(int array[], int target) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (array[i] == target)
                break;
        }
        return sum;
    }
}
