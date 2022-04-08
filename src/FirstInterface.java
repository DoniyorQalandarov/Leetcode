interface FirstInterface {
    public void firstMethod();
}
interface SecondInterface {
    public void secondInterface();
}
class TestInterface implements FirstInterface,SecondInterface {

    @Override
    public void firstMethod() {
        System.out.println("First Method");
    }

    @Override
    public void secondInterface() {
        System.out.println("Second Method");
    }
}
class MainClass {
    public static void main(String[] args) {
        TestInterface testObj = new TestInterface();
        testObj.firstMethod();
        testObj.secondInterface();
    }
}
