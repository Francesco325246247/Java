import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5,  "Five");
		map.put(6,  "Cat");
		map.put(7,  "Otto");
		map.put(12,  "Gatto");
		

		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": "+ value);
			
		}
		
	
		
		
		
		
		
		
	}

}
