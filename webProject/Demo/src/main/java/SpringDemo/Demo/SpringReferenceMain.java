package SpringDemo.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringReferenceMain {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("SpringReference.xml");
		 Employee e=(Employee)context.getBean("E");
		 System.out.println(e.getEmpno()+" \t "+e.getEname()+"\t"+e.getPresentaddress().getHno()+"\t "+e.getPermanentaddress().getArea()+"\t "+e.getPermanentaddress().getCity()+"\nPresentaddress\n"+e.getPresentaddress().getHno()+"\t "+e.getPresentaddress().getArea()+" "+e.getPresentaddress().getCity());
			
	}
}
