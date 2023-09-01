package exception.handling;

import java.io.File;
import java.io.IOException;

public class CallerMethodExample {

	void m1() throws IOException {
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void m2() throws IOException {
		m3();
	}

	void m3() throws IOException {
		File f = new File("");
		f.createNewFile();
	}

	public static void main(String[] args) throws IOException {
		CallerMethodExample c = new CallerMethodExample();
		c.m1();
		System.out.println("end>>>>>>>>>>>>>");
	}
}

abstract class MySelf {

	abstract void createFile() throws IOException;
}

 class Me extends MySelf {

	@Override
	void createFile(){
		
	}
 }














