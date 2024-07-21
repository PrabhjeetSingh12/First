import java.util.ArrayList;

class Chair {
    int id;
    String material;
    String color;
    float price;
    boolean hasArmrest;
    String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public boolean isHasArmrest() {
        return hasArmrest;
    }

    public void setHasArmrest(boolean hasArmrest) {
        this.hasArmrest = hasArmrest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Chair chair1 = new Chair();
        chair1.setId(1);
        chair1.setMaterial("Wood");
        chair1.setColor("Brown");
        chair1.setPrice(120.0f);
        chair1.setHasArmrest(true);
        chair1.setType("Office");

        System.out.println("Chair 1: " + chair1.getId() + ", " + chair1.getMaterial() + ", " + chair1.getColor() + ", " + chair1.getPrice() + ", " + chair1.isHasArmrest() + ", " + chair1.getType());
    ArrayList<Chair> ch = new ArrayList<>();
    
    for(Chair cr : ch) {
    	System.out.println("Chair 1: " + cr.getId());
    }
    }
}
