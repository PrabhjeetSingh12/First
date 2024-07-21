import java.util.ArrayList;
class Car {
	  int id;
	  String brand;
	  String model;
	  float price;
	  String engineType;
	  int year;
	  
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
	  
	  public String getModel() {
	      return model;
	  }
	  
	  public void setModel(String model) {
	      this.model = model;
	  }
	  
	  public float getPrice() {
	      return price;
	  }
	  
	  public void setPrice(float price) {
	      this.price = price;
	  }
	  
	  public String getEngineType() {
	      return engineType;
	  } 
	  void setEngineType(String engineType) {
	      this.engineType = engineType;
	  }
	  
	  public int getYear() {
	      return year;
	  }
	  
	  public void setYear(int year) {
	      this.year = year;
	  }
		  public static void main(String[] args) {
		      Car car1 = new Car();
		      car1.setId(1);
		      car1.setBrand("Toyota");
		      car1.setModel("Camry");
		      car1.setPrice(25000.0f);
		      car1.setEngineType("Hybrid");
		      car1.setYear(2022);
		      
		        Car car2 = new Car();
		        car2.setId(2);
		        car2.setBrand("Honda");
		        car2.setModel("Accord");
		        car2.setPrice(23000.0f);
		        car2.setEngineType("Petrol");
		        car2.setYear(2021);

		        Car car3 = new Car();
		        car3.setId(3);
		        car3.setBrand("Tesla");
		        car3.setModel("Model 3");
		        car3.setPrice(35000.0f);
		        car3.setEngineType("Electric");
		        car3.setYear(2023);
		     // System.out.println("Car 1: " + car1.getId() + ", " + car1.getBrand() + ", " + car1.getModel() + ", " + car1.getPrice() + ", " + car1.getEngineType() + ", " + car1.getYear());
		      //System.out.println("Car 2: " + car2.getId() + ", " + car2.getBrand() + ", " + car2.getModel() + ", " + car2.getPrice() + ", " + car2.getEngineType() + ", " + car2.getYear());
		        //System.out.println("Car 3: " + car3.getId() + ", " + car3.getBrand() + ", " + car3.getModel() + ", " + car3.getPrice() + ", " + car3.getEngineType() + ", " + car3.getYear());
		
		        ArrayList<Car> carob = new ArrayList<>();	
		        carob.add(car1);
		        carob.add(car2);
		        carob.add(car3);
		        
		        for(Car cr: carob) {
				      System.out.println("Car 1: " + cr.getId()  + ", " + cr.getBrand() + ", " + cr.getModel() + ", " + cr.getPrice() + ", " + cr.getEngineType() + ", " + cr.getYear() );
		        }
		        for (Car cr : carob) {
		            System.out.println("Car ID: " + cr.getId() + "\n" +
		                               "Brand: " + cr.getBrand() + "\n" +
		                               "Model: " + cr.getModel() + "\n" +
		                               "Price: " + cr.getPrice() + "\n" +
		                               "Engine Type: " + cr.getEngineType() + "\n");

		       
		  }
		  }
        }

