package SpringDemo.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAutowireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringAutowire.xml");
		Square s=(Square)context.getBean("s");
		System.out.println("Point A\t"+s.getPointA().getX()+" "+s.getPointA().getY()+"\n"+
		"Point B\t"+s.getPointB().getX()+" "+s.getPointB().getY()+"\n"+
		"Point C\t"+s.getPointC().getX()+" "+s.getPointC().getY()+"\n"+
		"Point D\t"+s.getPointD().getX()+" "+s.getPointD().getY()+"\n");
	}

}
