package link.list;

class Employee{
	Integer employeeId;
	String name;
    Employee next;
    
	public Employee(Integer employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}
}


public class CreateLinkList {

	public static void main(String[] args) {
		
		// insert
		Employee start = new Employee(11,"A");
		start.next = new Employee(22, "B");
		start.next.next = new Employee(33, "C");
		start.next.next.next = new Employee(44, "D");
		
			
			while(start != null){
				System.out.print("---->("+start.name+"-"+start.employeeId+")");
				start = start.next;
			}
						
	}
}
