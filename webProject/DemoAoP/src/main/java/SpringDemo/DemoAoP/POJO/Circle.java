package SpringDemo.DemoAoP.POJO;

import javax.management.RuntimeErrorException;
import java.util.*;
public class Circle {
	private int radius;

	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void DrawShape() {
		System.out.println("Circle Drawn");
	}
	/*
	 * public void checkRadius() {
	 * 
	 * if(radius>10) { System.out.println("OK"); }else {
	 * System.out.println("Radius not ok"); }
	 * 
	 * 
	 * } public void checkRadius2() throws Exception { try { Scanner scanner=new
	 * Scanner(System.in); int n=scanner.nextInt(); scanner.nextLine(); } catch
	 * (Exception e) { // TODO: handle exception throw new Exception(); } }
	 */
	public void setval() {
		System.out.println("hi");
	}
	public void setvalues(int a,int b) {
		System.out.println("hello");
	}
	public void setDone(int a,int b,int c) {
		System.out.println("Done");
	}
	
	
}
