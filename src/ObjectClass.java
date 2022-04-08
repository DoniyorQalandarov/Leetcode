public class ObjectClass {
    private int sanoq;
    private int raqam;

    public ObjectClass(int sanoq, int raqam) {
        this.raqam = raqam;
        this.sanoq = sanoq;
    }

    public void setSanoq(int sanoq) {
        this.sanoq = sanoq;
    }

    public void setRaqam(int raqam) {
        this.raqam = raqam;
    }
    public int getSanoq() {
        return sanoq;
    }
    public int getRaqam() {
        return raqam;
    }

    @Override
    public String toString() {
        return "ObjectClass{" +
                "sanoq=" + sanoq +
                ", raqam=" + raqam +
                '}';
    }
}
