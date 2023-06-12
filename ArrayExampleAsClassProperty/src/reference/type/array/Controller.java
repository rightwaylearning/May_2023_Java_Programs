package reference.type.array;

public class Controller {

	public static void main(String[] args) {
		
		
		ClassRoom room= new ClassRoom();
		room.std = "5th";
		room.classTeacherName = "varsha rani";
		
		room.students = new Student[3]; // 0 to 2
		
		
		                   
		                   
	    room.students[0] = new Student();
       room.students[0].name = "Mithun";
       room.students[0].rollNumber = 21;
		                   
	    //---------------------------------
	    
	    room.students[1] = new Student();
	    room.students[1].name = "Radha";
	    room.students[1].rollNumber = 24;
		
	    
	    room.students[2] = new Student();
	    room.students[2].name = "Ritu";
	    room.students[2].rollNumber = 25;
	    
	    ViewClassRoomInfo.printInfo(room);
	
	}
}
