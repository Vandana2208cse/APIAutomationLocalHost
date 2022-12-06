package BasicRequests;

import java.util.HashMap;

public class HashmapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
        
        hm.put("name", "TEN");
        hm.put("id", "10");
        hm.put("Designation", "CEO");
        
        System.out.println(hm);
        System.out.println(hm.get("id"));
        
        
    

	}

}
