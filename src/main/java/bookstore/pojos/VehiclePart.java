package bookstore.pojos;
import java.util.Objects;
public abstract class VehiclePart extends Product {

    private String manufacturer;
    private double price;

    public VehiclePart() {
        super();
    }

    public VehiclePart(String manufacturer, double price) {

    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiclePart that = (VehiclePart) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price);
    }

    protected abstract void setCopies(int copies);

    public abstract int getCopies();
}