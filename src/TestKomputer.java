import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestKomputer {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo(LocalDate.now(), 8888888, "700GB", "700Gb");
        Lenovo lenovo1 = new Lenovo(LocalDate.now(), 8888888, "700GB", "700Gb");
        Hp hp = new Hp(LocalDate.now(),44444,"555","666");


        if (lenovo.equals(lenovo1)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
        if (lenovo.hashCode() == lenovo1.hashCode()) {
            System.out.println("codes equals");
        } else {
            System.out.println("codes not equals");
        }
        if (hp.equals(lenovo)) {
            System.out.println("equals hp with lenovo");
        }
        else {
            System.out.println("not equals hp with lenovo");
        }
        if (hp.hashCode() == lenovo.hashCode()) {
            System.out.println("hashCodes equals");
        }
        else {
            System.out.println("not equals hashCodes");
        }
    }
}
