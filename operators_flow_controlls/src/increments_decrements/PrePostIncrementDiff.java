package increments_decrements;

public class PrePostIncrementDiff {

	public static void main(String[] args) {
		
		
		int x =10;
		int y = x++;
		//     L  <-----W
		// post increment 
		// 1] y = x
		// 2] x++;
		
		System.out.println(x); // 11
		System.out.println(y); // 10
		
		
		System.out.println("---------------");
		
		int n = 21;
		
		int m = ++n;
		// execution from L <---- W
		// 1] ++n
        // 2] m = n;		
		
		System.out.println(n);
		System.out.println(m);
		
		System.out.println("--------------------");
		
		int k = 5; // 6 // 7
		int j = 6; // 7 // 8
		
		int p = ++k * j++;
		  //p = 6 * 6
		  //p = 36
		  // j = 7
		//------------------------
		
		int d = ++k + ++j;
		   //d= 7 + 8;
		   // d =15
		
		
		System.out.println(k); // 7
		System.out.println(j);  // 8
		System.out.println(p); //>>>>>>>>>>>>>> // 36
		System.out.println(d); // >>>>>>>>>>>>>>>>>// 15
		
		
		//-----------------------------------------
		
		
		int size = 10;
		
		++size;
		size++;
		--size;
		size--;
		
		//------------------------
		
	//	++11;  >> its C.E
		
		
		char ch = 'A';
		ch++;
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
