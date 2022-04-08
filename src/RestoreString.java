import java.util.Scanner;

public class RestoreString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sozni kiriting:");
        String soz = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(soz);
        // char[] chars = soz.toCharArray();
        for (int i = 0; i < stringBuilder.length(); i++) {
            stringBuilder.setCharAt(0, 'l');
            stringBuilder.setCharAt(1, 'e');
            stringBuilder.setCharAt(2, 'e');
            stringBuilder.setCharAt(3, 'd');
            stringBuilder.setCharAt(4, 'c');
            stringBuilder.setCharAt(5, 'o');
            stringBuilder.setCharAt(6, 'd');
            stringBuilder.setCharAt(7, 'e');
            soz = stringBuilder.toString();
        }
        System.out.println(soz);
    }
}
