package default_values;

public class Controller {

	 
	 
     public static void main(String[] args){

        byte b = 10;
        
        long l = b;
        
        //-----------------------------
        
        int i = 1000;
        
        byte b1 = (byte)i;
        System.out.println(b1);
        
        //===================
        
        double d =89.67;
        
        int y  =(int) d;
        
        System.out.println(y);
        
        System.out.println("====================================");
        
        int[] arr = new int[90];
       // System.out.println(arr.length);
        
        //=========================================================
        
        
        
        
        int[] arr1 = {10,99,67,89}; // 4 >> 0-3
        System.out.println(arr1[1]);
        
        
        Student[] s= new Student[2];
        
        s[0] = new Student();
            s[0].name = "Joyti";
            
            
        //==================================================    
           
             Student s1 = new Student(); 
             s1.name ="Rutuja";
            
        s[1] = s1;   
        
        //========================================================
        
        Student x1= new Student();
        x1.name = "Suraj";
        
        Student x2=new Student();
        x2.name = "Mahesh";
        
        Student[] arr2 = {x1,x2};
        
        System.out.println(arr2.length);
        
        System.out.println(arr2[1].name);
        System.out.println(x2.name);
        x1.name = "Latha";
        System.out.println(arr2[0].name);
        
        //========================================================
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

     }
}
