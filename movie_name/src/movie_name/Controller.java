package movie_name;

public class Controller {

	public static void main(String[] args) {
		
		Friend f= new Friend();
				
		
		int rs = 200;
		f.ticketPrice(rs);
		
		f.ticketPrice(300);
		
		
		MovieShow m1 = new MovieShow();
		f.request(m1);
		
		
		f.request(new MovieShow());
		
	}
}
