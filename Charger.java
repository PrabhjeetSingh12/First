public class Charger {
    int id;
    String Brand;
    String Model;
    float Price;
    String Colour;
    
    
    public int getid() {
        return id; 
        }
    public void setid(int id) {
        this.id = id;
    }
    public String getBrand() {
          return Brand;
      }
      
    public void setBrand(String Brand) {
          this.Brand = Brand;
      }
    public String getModel() {
          return Model;
      }
      
    public void setModel(String Model) {
          this.Model = Model;
      }
    public float getPrice() {
          return Price;
      }
      
    public void setPrice(float Price) {
          this.Price = Price;
      }
    public String getColour() {
          return Colour;
          }
    public void setColour(String Colour) {
          this.Colour = Colour;
      }
      
      public static void main(String[] args) {
          Charger object = new Charger();
          object.setid(1);
          object.setBrand("Apple");
          object.setModel("mingi");
          object.setColour("white");
      
      System.out.println("charger 1 : " + object.getid() + " , "+ object.getBrand() + " , " + object.getModel() + " , " + object.getColour());		  
      
      }
      
    
}
