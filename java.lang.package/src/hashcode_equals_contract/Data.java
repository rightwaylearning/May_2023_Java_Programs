package hashcode_equals_contract;

public class Data implements Cloneable{
   int i;
   int j;
   char c;
   
   @Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
