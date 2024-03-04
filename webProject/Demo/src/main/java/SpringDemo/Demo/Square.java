package SpringDemo.Demo;

public class Square {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	public Point getPointA() {
		return pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public Point getPointD() {
		return pointD;
	}
	public Square(Point p1, Point p2, Point p3, Point p4) {
		super();
		this.pointA = p1;
		this.pointB = p2;
		this.pointC = p3;
		this.pointD = p4;
	}
	
	public Square() {
		super();
	}
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}
//	public void setPointD(Point pointD) {
//		this.pointD = pointD;
//	}
	
}
