package dynamic_array;

class ResizableArray{
	
	Integer[] arr;
	Integer index;
	
	public ResizableArray() {
		this(5);
	}
	
	public ResizableArray(int length) {
		this.arr = new Integer[length];
		this.index = 0;
	}
	
	private Integer[] increaseArraySizeAndReInit() {
		System.out.println("-------------------");
		Integer[] newArray= new Integer[arr.length*2];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
		
	}
	
   public void readArray() {
	   for (int i = 0; i < arr.length; i++) {
		   System.out.print(arr[i]+" ");
	   }
   }	
   
   void addElement(Integer iteam) {
	  if(index < arr.length) {
		  arr[index] = iteam;
		  index++;
	  } else {
		  this.arr = increaseArraySizeAndReInit();
		  arr[index] = iteam;
		  index++;
	  }
   }
}


public class CreateResizableArray {

	public static void main(String[] args) {
		ResizableArray obj = new ResizableArray();
		obj.addElement(100); // 0
		obj.addElement(200); //1
		obj.addElement(300); //2
		obj.addElement(400); //3
		obj.addElement(500); //4
		obj.addElement(600); //4
		
		obj.readArray();
		
	}
}
