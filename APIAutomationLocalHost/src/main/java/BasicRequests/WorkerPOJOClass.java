package BasicRequests;

public class WorkerPOJOClass {
	
	private String name;
	private String Designation;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

		// converting object data back to string 


		        public static void ToString(WorkerPOJOClass obj)
		        
		        {
		            System.out.println(obj.getDesignation());
		            System.out.println(obj.getName());
		            System.out.println(obj.getId());
		            
		        }
		       

}
