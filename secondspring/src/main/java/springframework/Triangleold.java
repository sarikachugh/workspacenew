package springframework;

public class Triangleold {
	
	private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}

	public Triangleold(String type){
		this.type = type;
	}
	
	public Triangleold(int height){
		this.height = height;
	}
	
	public Triangleold(String type, int height ){
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	public void draw() {
		System.out.println(getType() + " Triangle drawn of Height " + getHeight());
	}
}
