import java.util.ArrayList;

public class Laptop {
  int id;
  String model;
  float price;
  String processor;
  String storage;
  
	 public  int getid() {
		  return id;
		  }
	 public void setid(int id) {
		  this.id = id;
	  }
	 public String getModel() {
		  return model;
	  }
	  public void setModel(String Model) {
		  this.model= Model;
	  }
	 public float getPrice() {
		  return price;
	  }
	  public void setPrice(float Price) {
		  this.price= Price;
	  }
	  public String getProcessor() {
		  return processor;
	  }
	 public void setProcessor(String Processor) {
		  this.processor =  Processor;
	  }
	 public String getStorage() {
		  return storage;
	  }
	  public void setStorage(String Storage) {
		  this.storage=  Storage;
		  }
	  

	  public static void main(String[] args) {
	      Laptop laptop1 = new Laptop();
	      laptop1.setid(1);
	      laptop1.setModel("Anx");
	      laptop1.setPrice(100.65F);
	      laptop1.setProcessor("Intel i5");
	      laptop1.setStorage("256GB SSD");
	      
	      Laptop laptop2 = new Laptop();
	      laptop2.setid(2);
	      laptop2.setModel("knk");
	      laptop2.setPrice(120);
	      laptop2.setProcessor("Intel i7");
	      laptop2.setStorage("512GB SSD");
	      
	      Laptop laptop3 = new Laptop();
	      laptop3.setid(3);
	      laptop3.setModel("USHB");
	      laptop3.setPrice(150);
	      laptop3.setProcessor("Intel i9");
	      laptop3.setStorage("1TB SSD");
	      
      System.out.println("Laptop 1: " + laptop1.getid() + ", " + laptop1.getModel() + ", " + laptop1.getPrice() + ", " + laptop1.getProcessor() + ", " + laptop1.getStorage());
      System.out.println("Laptop 2: " + laptop2.getid() + ", " + laptop2.getModel() + ", " + laptop2.getPrice() + ", " + laptop2.getProcessor() + ", " + laptop2.getStorage());
      System.out.println("Laptop 3: " + laptop3.getid() + ", " + laptop3.getModel() + ", " + laptop3.getPrice() + ", " + laptop3.getProcessor() + ", " + laptop3.getStorage());

      ArrayList<Laptop> lp = new ArrayList<>();
      lp.add(laptop1);
      lp.add(laptop2);
      lp.add(laptop3);
	 
	  for(Laptop lpt : lp) {
		  System.out.println("Laptop : " + lpt.getid() + "\n Model : " + lpt.getModel() + "\n Price : " + lpt.getPrice() + "\n Processor : " + lpt.getProcessor() + "\n Storage : "+ lpt.getStorage() );
	  }
	  }
  }

