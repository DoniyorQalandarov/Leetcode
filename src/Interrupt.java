public class Interrupt implements Runnable {
    @Override
    public void run() {
        String array[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Bizga halaqit berishdi");
        }
    }

    public static void main(String[] args) {
        Interrupt object = new Interrupt();
        Thread thread = new Thread(object);
        object.run();
        try {
            thread.interrupt();
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
