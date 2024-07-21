public class Table {
    int id;
    String material;
    float price;
    String shape;
    int legs;
    
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
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    public String getShape() {
        return shape;
    }
    
    public void setShape(String shape) {
        this.shape = shape;
    }
    
    public int getLegs() {
        return legs;
    }
    
    public void setLegs(int legs) {
        this.legs = legs;
    }
  


    public static void main(String[] args) {
        Table table1 = new Table();
        table1.setId(1);
        table1.setMaterial("Wood");
        table1.setPrice(150.0f);
        table1.setShape("Round");
        table1.setLegs(4);
        
        Table table2 = new Table();
          table2.setId(2);
          table2.setMaterial("Metal");
          table2.setPrice(200.0f);
          table2.setShape("Square");
          table2.setLegs(4);

          Table table3 = new Table();
          table3.setId(3);
          table3.setMaterial("Glass");
          table3.setPrice(250.0f);
          table3.setShape("Rectangle");
          table3.setLegs(4);
        
       
        System.out.println("Table 1: " + table1.getId() + ", " + table1.getMaterial() + ", " + table1.getPrice() + ", " + table1.getShape() + ", " + table1.getLegs());
        System.out.println("Table 2: " + table2.getId() + ", " + table2.getMaterial() + ", " + table2.getPrice() + ", " + table2.getShape() + ", " + table2.getLegs());
        System.out.println("Table 3: " + table3.getId() + ", " + table3.getMaterial() + ", " + table3.getPrice() + ", " + table3.getShape() + ", " + table3.getLegs());
    }
  
    
}
