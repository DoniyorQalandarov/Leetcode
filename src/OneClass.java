public class OneClass extends ObjectClass{
    private int son;
    public OneClass(int sanoq, int raqam,int son) {
        super(sanoq, raqam);
        this.son = son;
    }

    @Override
    public void setRaqam(int raqam) {
        super.setRaqam(raqam);
    }

    @Override
    public void setSanoq(int sanoq) {
        super.setSanoq(sanoq);
    }

    @Override
    public int getRaqam() {
        return super.getRaqam();
    }

    @Override
    public int getSanoq() {
        return super.getSanoq();
    }

    public void setSon(int son) {
        this.son = son;
    }

    public int getSon() {
        return son;
    }

    @Override
    public String toString() {
        return "OneClass{" +
                "son=" + son +
                '}';
    }
}
