public class Pen {
    int id;
    String brand;
    String color;
    float price;
    String type;
    boolean refillable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRefillable() {
        return refillable;
    }

    public void setRefillable(boolean refillable) {
        this.refillable = refillable;
    }

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setId(1);
        pen1.setBrand("Parker");
        pen1.setColor("Black");
        pen1.setPrice(10.5f);
        pen1.setType("Gel");
        pen1.setRefillable(true);

        System.out.println("Pen 1: " + pen1.getId() + ", " + pen1.getBrand() + ", " + pen1.getColor() + ", " + pen1.getPrice() + ", " + pen1.getType() + ", " + pen1.isRefillable());
    }

    
}
