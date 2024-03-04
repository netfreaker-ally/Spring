package SpringDemo.Demo;

public class Rectangle {
	int dim1;
	int dim2;
	
	
	public void setDim1(int dim1) {
		this.dim1 = dim1;
	}

	

	public void setDim2(int dim2) {
		this.dim2 = dim2;
	}

	public void DrawShape() {
		System.out.println("a and b are    "+(dim1+1)+" "+(dim2+1));
	}
}
