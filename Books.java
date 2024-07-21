import java.util.ArrayList;

public class Books {
	
	 int book_id;
	 String name;
	 float price;
	 int pages;
	 String author;
	 
	 
	 
	 public int getBook_id() {
		 return book_id;
	 }
	  public void setBook_id(int Book_id) {
		 this.book_id= Book_id;
		 }
	 public  String getName() {
		 return name;
	 }
	 public void setName(String Name) {
		 this.name = Name;
	 }
	 public float getPrice() {
		 return price;
	 }
	 public void setPrice(float Price) {
		 this.price= Price;
	 }
	 public int getPages() {
		 return pages;
	 }
	 public void setPages(int Pages) {
		this.pages=Pages; 
	 }
	 public String getAuthor() {
		 return author;
	 }
	 public void SetAuthor(String Author) {
		 this.author= Author;
	 }
	
 public static void main(String[] args) { 
		 Books book1 = new Books();
		 book1.setBook_id(1); 
		 book1.setName("Harry Potter");
		book1.setPrice(100);
		book1.setPages(120);
		book1.SetAuthor("J.k Rowling");
		
		 Books book2 = new Books();
	        book2.setBook_id(2);
	        book2.setName("The Hobbit");
	        book2.setPrice(150);
	        book2.setPages(310);
	        book2.SetAuthor("J.R.R. Tolkien");

	        Books book3 = new Books();
	        book3.setBook_id(3);
	        book3.setName("1984");
	        book3.setPrice(200);
	        book3.setPages(328);
	        book3.SetAuthor("George Orwell");
		
	        
	
		
		
	        ArrayList<Books> bookArLi = new ArrayList<Books>(); 
			 bookArLi.add(book1);
			 bookArLi.add(book2);
			 bookArLi.add(book3);
 
			 for (Books book : bookArLi) {
				 System.out.println("Book ID: " + book.getBook_id() + ", Name: " + book.getName() + ", Price: " + book.getPrice() + ", Pages: " + book.getPages() + ", Author: " + book.getAuthor());
				}
			 
		
			 Books maxPriceBook = book1;
 		            if (book2.getPrice() > maxPriceBook.getPrice() ) {
 		           if(book2.getPrice()>book3.getPrice()) {
		                maxPriceBook = book2;
		            }
 		            }
 		            if (book3.getPrice() > maxPriceBook.getPrice()) {
 		            		maxPriceBook = book3;
 		            	}
 		            
		        System.out.println("Book with the maximum price:");
		        System.out.println(" Name: " + maxPriceBook.getName());
		    }
		}

