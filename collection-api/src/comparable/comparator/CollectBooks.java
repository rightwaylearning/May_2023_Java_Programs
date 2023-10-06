package comparable.comparator;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectBooks {

	public static void main(String[] args) {
		
		
		//TreeSet<Book> tree = new TreeSet<>(); // DNSO
		TreeSet<Book> tree = new TreeSet<>(new MySortOrder()); // custom order
		tree.add(new Book(101, "Black Book", "Nageshwar rao",300.00F));
		tree.add(new Book(89,"Head First", "Head First team",299.0F));
		tree.add(new Book(99,"Head First updated", "Head First team",252.80F));
		tree.add(new Book(10,"Head First lates", "Head First team",100.00F));
		
		for (Book book : tree) {
			System.out.println(book);
		}
	}
}

class MySortOrder implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		
		
		int order = o1.getBookAuthor().compareTo(o2.getBookAuthor());
		if(order == 0) {
			int priceOrder = o1.getPrice().compareTo(o2.getPrice());
			if(priceOrder == 0) {
				 return -1;
			}
			return priceOrder;
		}
		return order;
	}
}

