import java.time.LocalDate;
import java.util.Objects;

public class Lenovo {
    private LocalDate manufactoryDate;
    private int cost;
    private String ram;
    private String ssd;

    public Lenovo(LocalDate manufactoryDate, int cost, String ram, String ssd) {
        this.manufactoryDate = manufactoryDate;
        this.cost = cost;
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lenovo lenovo = (Lenovo) o;
        return cost == lenovo.cost &&
                manufactoryDate.equals(lenovo.manufactoryDate) &&
                Objects.equals(ram, lenovo.ram) &&
                ssd.equals(lenovo.ssd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactoryDate, cost, ram, ssd);
    }

    public LocalDate getManufactoryDate() {
        return manufactoryDate;
    }

    public void setManufactoryDate(LocalDate manufactoryDate) {
        this.manufactoryDate = manufactoryDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "manufactoryDate=" + manufactoryDate +
                ", cost=" + cost +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }
}
