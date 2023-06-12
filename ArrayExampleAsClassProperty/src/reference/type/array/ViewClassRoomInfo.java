package reference.type.array;

public class ViewClassRoomInfo {

	
	static void printInfo(ClassRoom room) {
	
		System.out.println(room.classTeacherName);
		System.out.println(room.std);
		
		
		for(int i = 0;  i < room.students.length;  i++) {
			System.out.println(room.students[i].name);
			System.out.println(room.students[i].rollNumber);
		}
		
		
		
		
		
	}
}

