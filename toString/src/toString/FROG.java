package toString;

public class FROG {
	
	private int id;
	private String name; 
	

	public FROG(int id, String name){
		
		this.id = id;
		this.name = name;
	}




	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	
	}

}
