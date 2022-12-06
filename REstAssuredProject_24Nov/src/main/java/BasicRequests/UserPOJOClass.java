package BasicRequests;

public class UserPOJOClass {
	
	private String firstname;
	private String lastname;
	private String emailid;
	private String designation;
	private int id;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

    public static void ToString(UserPOJOClass obj)
    
    {
        System.out.println(obj.getFirstname());
        System.out.println(obj.getLastname());
        System.out.println(obj.getEmailid());
        System.out.println(obj.getDesignation());
        System.out.println(obj.getId());
        
    }
	

}
