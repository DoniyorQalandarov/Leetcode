import java.util.Arrays;

public class ObjectTest {
    public static void main(String[] args) {
        Object objectClass = new ObjectClass(4, 54);
        ObjectClass oneClass = new OneClass(777, 888, 999);
        System.out.println(objectClass);//konstruktordagi qiymatlari
        ((ObjectClass) objectClass).setSanoq(777777);
        ((ObjectClass) objectClass).setRaqam(999999);
        System.out.println(((ObjectClass) objectClass).getSanoq());
        System.out.println(((ObjectClass) objectClass).getRaqam());//set qilingandan keyingi holat
        System.out.println(objectClass);//OneClassining konstruktordagi qiymatlari
        oneClass.setRaqam(111);
        oneClass.setSanoq(222);
        System.out.println(oneClass.getRaqam());
        System.out.println(oneClass.getSanoq());//set qilingandagi holati
        System.out.println(Object.class.describeConstable());
        System.out.println(Arrays.toString(Object.class.getAnnotations()));
    }
}
