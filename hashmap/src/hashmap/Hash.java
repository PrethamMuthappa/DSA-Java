package hashmap;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		
		HashMap<String, String> details=new HashMap<String, String>();
		
		//we need to add key value pairs and insert to hashmap
		
		details.put("name", "pretham");
		details.put("age", "20");
		details.put("address", "bangalore");
		
		// to remove 
		details.remove("name");
		
		// can return a value
		
		System.out.println(details.get("address"));
		// to clear everything
		
	    // details.clear()
		;
		
		 System.out.println(details.size());
		 
		 // to replace a value
		 details.replace("address", "japan");
		 
		 // to check if value is present or not , its a boolean 
		 System.out.println(details.containsKey("name"));
		 System.out.println(details.containsValue("20"));
		 //to display
		 for(String i:details.keySet()) {
			 
			 System.out.println(i);
			 System.out.println(details.get(i));
		 }
		 
		
	}

}
