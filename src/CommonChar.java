import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChar {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(common(new String[]{"Lsds", "ldsdss", "udgeug","lkssa"})));
    }

    public static String[] common(String[] word) {
        String satr[] = new String[4];
        for (int i = 0; i < word.length; i++) {
            char ch[] = word[i].toCharArray();
            if (ch[i] == 'l');
            satr[i] = String.valueOf(ch[i]);
        }
        return satr;
    }
}
