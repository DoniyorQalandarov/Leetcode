public class Oqim {
    //    @Override
//    public void run() {
//        System.out.println("Men oqimman");
//    }
//
//    public static void main(String[] args) {
//      Oqim runnableObekt = new Oqim();
//      Thread thread = new Thread(runnableObekt);
//      thread.start();
    public static void main(String[] args) throws InterruptedException {
        String viloyatlar[] = {"Andijon",
                "Namangan",
                "Fargona",
                "Qashqadaryo", "Buxoro", "Samanrqand", "Xorazm", "Surxondaryo"};
        for (int i = 0; i < viloyatlar.length; i++) {
            Thread.sleep(4000);
            System.out.println(viloyatlar[i]);
        }
        int raqamlar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < raqamlar.length;i++) {
            Thread.sleep(5000);
            System.out.println(raqamlar[i]);
        }
    }
}
