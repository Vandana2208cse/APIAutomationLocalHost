package BasicRequests;

import java.util.HashMap;

public class Hashmap_basic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
        
        hm.put("firstname", "Bishun");
        hm.put("lastname", "kumar");
        hm.put("emailid", "b@gmail.com");
        hm.put("designation", "Associate-Data");
        hm.put("id", "9");
        
        System.out.println(hm);
        System.out.println(hm.get("id"));
        
        
    

	}

}
