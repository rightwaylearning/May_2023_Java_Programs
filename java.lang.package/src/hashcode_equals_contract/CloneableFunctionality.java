package hashcode_equals_contract;

public class CloneableFunctionality {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Data d1=new Data();
		d1.i =100;
		d1.j =200;
		d1.c ='A';
		
		Data d2 = (Data)d1.clone();
		
		
		System.out.println(d1.i);
		System.out.println(d1.hashCode());
		
		System.out.println(d2.i);
		System.out.println(d2.hashCode());
	}
}
