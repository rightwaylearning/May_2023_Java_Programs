package vector.classes;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<>();
		
		v.add(10);  // collection
		v.add(0, 5); // List >>>>  index
		v.addElement(40);
		
		
		v.remove(0);  ///remove(int index) >>>>>>>>>>>>> List
		v.remove(new Integer(10)); // remove(Object obj) >>>>>>>>>>>> Collection
        v.removeElement(40);
        
        
         // get(int index) >>>> List
         // elementAt(int index)
         // fiestElement()
         // lastElement()
        
		 // int size();
         // int capacity();
		System.out.println(v);
		
	}
}
