public class Rekursia {
    public static void main(String[] args) {
        System.out.println(rekursia(2));
    }
    public static long rekursia(int raqam) {
        if (raqam <= 1)
            return 1;
        else
            return raqam*rekursia(raqam - 1);
    }
}
