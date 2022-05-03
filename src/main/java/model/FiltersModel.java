package model;

public class FiltersModel {
    private String name;
    private String brand;
    private String price;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Filters{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
