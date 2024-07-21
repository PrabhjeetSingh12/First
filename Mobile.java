public class Mobile {
	String name;
	String storage;
	String colour;
	String size;
	String camera;
	
	public String getName() {
		return name;	
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String Storage) {
		this.storage = Storage;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String Colour) {
		this.colour = Colour;
	}
	public String getsize() {
		return size;
	}
	public void setSize(String Size) {
		this.size = Size;
}
	String getCamera() {
		return camera;
	}
	void setCamera(String Camera) {
		this.camera = Camera;
	}
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.setName("Google");
		m1.setStorage("128gb");
		m1.setColour("black");
		m1.setSize("11cm");
		m1.setCamera("12mp");
		
		System.out.println("Name " + m1.getName());
		System.out.println("Storage " + m1.getStorage());
		System.out.println("Colour: " + m1.getColour());  
		System.out.println("Size: " + m1.getsize());
		System.out.println("Camera: " + m1.getCamera() + '\n' );
	
		
		Mobile m2= new Mobile();
		m2.setName("iphone");
		m2.setStorage("64gb");
		m2.setColour("white");
		m2.setSize("10cm");
		m2.setCamera("14mp");
		
		System.out.println("Name " + m2.getName());
		System.out.println("Storage " + m2.getStorage());
		System.out.println("Colour: " + m2.getColour());
		System.out.println("Size: " + m2.getsize());
		System.out.println("Camera: " + m2.getCamera() + '\n');
		
		
		Mobile m3 = new Mobile();
		m3.setName("Google");
		m3.setStorage("12gb");
		m3.setColour("white");
		m3.setSize("11cm");
		m3.setCamera("12mp");
		
		System.out.println("Name " + m3.getName());
		System.out.println("Storage " + m3.getStorage());
		System.out.println("Colour: " + m3.getColour());
		System.out.println("Size: " + m3.getsize());
		System.out.println("Camera: " + m3.getCamera() + '\n');

	}
}
