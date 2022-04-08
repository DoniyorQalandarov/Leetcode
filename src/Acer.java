import java.time.LocalDate;
import java.util.Objects;

public class Acer {
private LocalDate manufacturyDate;
private int cost;
private String ram;
private String ssd;

    public Acer(LocalDate manufacturyDate, int cost, String ram, String ssd) {
        this.manufacturyDate = manufacturyDate;
        this.cost = cost;
        this.ram = ram;
        this.ssd = ssd;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acer acer = (Acer) o;
        return cost == acer.cost && manufacturyDate.equals(acer.manufacturyDate) && ram.equals(acer.ram) && ssd.equals(acer.ssd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturyDate, cost, ram, ssd);
    }

    public LocalDate getManufacturyDate() {
        return manufacturyDate;
    }

    public void setManufacturyDate(LocalDate manufacturyDate) {
        this.manufacturyDate = manufacturyDate;
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
        return "Acer{" +
                "manufacturyDate=" + manufacturyDate +
                ", cost=" + cost +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }
}

