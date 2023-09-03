package object.class_methods;

public class ToStringMethodBody {
	
//	@Override
//	public String toString() {
//		return "hello";
//	}
	
	@Override
	public int hashCode() {
		return 5;
	}

	public static void main(String[] args) {
		
		// object.class_methods.ToStringMethodBody
	
		ToStringMethodBody obj = new ToStringMethodBody();
		
		System.out.println(obj.getClass().getName() +"@"+Integer.toHexString(obj.hashCode()));
		                //     getClass().getName() + "@" + Integer.toHexString(hashCode())
		System.out.println(obj.toString());
	}
}

// Class getClass();
// String toString();
// int hashCode();
// equals









