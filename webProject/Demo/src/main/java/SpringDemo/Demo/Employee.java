package SpringDemo.Demo;

public class Employee {
	private int empno;
	private String ename;
	private Address presentaddress;
	private Address permanentaddress;
	public Employee(int empno, String ename, Address presentaddress, Address permanentaddress) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.presentaddress = presentaddress;
		this.permanentaddress = permanentaddress;
	}
	public Employee() {
		super();
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public Address getPresentaddress() {
		return presentaddress;
	}
	public Address getPermanentaddress() {
		return permanentaddress;
	}
	
}
