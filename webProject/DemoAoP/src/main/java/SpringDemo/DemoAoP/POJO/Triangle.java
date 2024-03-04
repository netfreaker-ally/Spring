package SpringDemo.DemoAoP.POJO;

public class Triangle {
	private int base,height;
	private String type;
	

	public Triangle(int base, int height, String type) {
		super();
		this.base = base;
		this.height = height;
		this.type = type;
	}

	public Triangle() {
		super();
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
			this.height = height;
		}	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void DrawShape() {
		System.out.println("Triangle Drawn ");
	}
	
	
}
