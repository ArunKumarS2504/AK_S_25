package Hashmap;

import java.util.HashMap;


public class Hash {
	
	static boolean answer=false;
	
	public static void main(String arg[]) {
		HashMap<String,String>map= new HashMap<String,String>();
		
		map.put("Name","AK");
		map.put("Age", "23");
		map.put("Gender", "Male");
		map.put("etc", ".....");
		
		System.out.println(map.get("Age"));
		System.out.println(map.containsKey("Age"));
		System.out.println(map.clone());
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		//System.out.println(map.);
		
		
		String search="Male";
		map.forEach((key,value)->{
			if(key.contains(search)|| value.contains(search)) {
				
				answer=true;
				
			}
			
		});
		System.out.println(answer);
		
	}

}
