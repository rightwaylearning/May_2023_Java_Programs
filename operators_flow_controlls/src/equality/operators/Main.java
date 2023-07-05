package equality.operators;

public class Main {

	 public static void main(String[] args) {
		  AA a= new AA();
	      Object o = new Object();
	      BB b= new BB();
	      BB b1=b;


	      if(b==b1 || b==a){
	        System.out.println("I am true block");
	      }else{
	        System.out.println("I am false block");
	      }
	}
}

class AA{
	
}

class BB extends AA{
	
}
