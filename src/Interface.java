interface IF {
    int i = 0;

    void method();
}

class Test implements IF {
    public static void main(String[] args) {
        System.out.println(i);
        Test test = new Test();
        test.method();
    }
    @Override
    public void method() {
    }
}
