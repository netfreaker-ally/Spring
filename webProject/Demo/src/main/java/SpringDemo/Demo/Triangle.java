package SpringDemo.Demo;

public class Triangle {
	int a;
	int b;
  public Triangle() 
  	{
		// TODO Auto-generated constructor stub
	  System.out.println("Default Constructor");	
	}
	public Triangle(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void DrawShape()
	{
		System.out.println("Triangle"+a+" "+b);
	}
}
