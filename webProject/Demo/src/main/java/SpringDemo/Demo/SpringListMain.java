package SpringDemo.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringListMain {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("SpringList.xml");
		 Student s=(Student)context.getBean("s");
		 System.out.println(s.studentNo+" \n "+s.studentName);
		for (int i = 0; i < s.getMarkss().size(); i++)
		{
			System.out.println(s.getMarkss().get(i));
		}
		for (int i = 0; i < s.getTeachers().size(); i++)
		{
			System.out.println(s.getTeachers().get(i).gettCode()+" "+s.getTeachers().get(i).getName());
		}
	}
}
