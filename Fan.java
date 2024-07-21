import java.util.ArrayList;

class Fan {
	  int id;
	  String brand;
	  float price;
	  String type;
	  int speedLevels;
      
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
	  
	  public int getSpeedLevels() {
	      return speedLevels;
	  }
	  
	  public void setSpeedLevels(int speedLevels) {
	      this.speedLevels = speedLevels;
	  }
	

	  public static void main(String[] args) {
	      Fan fan1 = new Fan();
	      fan1.setId(1);
	      fan1.setBrand("Brand A");
	      fan1.setPrice(50.0f);
	      fan1.setType("Ceiling Fan");
	      fan1.setSpeedLevels(5);
	      
	      Fan fan2 = new Fan();
	        fan2.setId(2);
	        fan2.setBrand("Brand B");
	        fan2.setPrice(40.0f);
	        fan2.setType("Table Fan");
	        fan2.setSpeedLevels(3);

	        Fan fan3 = new Fan();
	        fan3.setId(3);
	        fan3.setBrand("Brand C");
	        fan3.setPrice(60.0f);
	        fan3.setType("Tower Fan");
	        fan3.setSpeedLevels(4);
	  
	        System.out.println("Fan 1: " + fan1.getId() + ", " + fan1.getBrand() + ", " + fan1.getPrice() + ", " + fan1.getType() + ", " + fan1.getSpeedLevels());
	        System.out.println("Fan 2: " + fan2.getId() + ", " + fan2.getBrand() + ", " + fan2.getPrice() + ", " + fan2.getType() + ", " + fan2.getSpeedLevels());
	        System.out.println("Fan 3: " + fan3.getId() + ", " + fan3.getBrand() + ", " + fan3.getPrice() + ", " + fan3.getType() + ", " + fan3.getSpeedLevels());
	  
	  ArrayList<Fan> fn = new ArrayList<>();
	  fn.add(fan1);
	  fn.add(fan2);
	  fn.add(fan3);
	   
	  for(Fan fa :fn) {
	        System.out.println("Fan : " + fa.getId() + ", " + fa.getBrand() + ", " + fa.getPrice() + ", " + fa.getType() + ", " + fa.getSpeedLevels());

	}
	  }
	 }