package shallow_cloning.examples;

public class Student implements Cloneable{
     Integer rollNumber;
     double percentage;
     String name;
     School sc;
     
     @Override
    public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
}

