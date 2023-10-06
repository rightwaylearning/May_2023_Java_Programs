package comparable.comparator;

public class Book implements Comparable<Book>{
  
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private Float price;
	
	public Book() {}

	public Book(Integer bookId, String bookName, String bookAuthor,Float price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}
	
	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price
				+ "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.getBookId().compareTo(o.getBookId());
	}
		
}
