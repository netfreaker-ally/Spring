package SpringDemo.DemoAoP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DemoAspect {
	/*
	 * @After("execution(public void DrawShape())") public void DemoAdvice1() {
	 * System.out.println("Demo1 advice called"); }
	 * 
	 * @Before("execution(public int get*())") public void DemoAdvice2(JoinPoint p)
	 * { System.out.println("Demo2 advice called"+p.getTarget()); }
	 * 
	 * @Before("execution(public * get*())") public void DemoAdvice3(JoinPoint p) {
	 * System.out.println("Demo3 advice called"+p.getTarget()); }
	 * 
	 * @Before("execution(public int get*()) ||execution(public void set*(*)) || execution(public void DrawShape())"
	 * ) public void DemoAdvice4(JoinPoint p) {
	 * System.out.println("Demo4 advice called"+p.getTarget()); }
	 * 
	 * @Pointcut("execution(public int get*())") public void pc1() {
	 * System.out.println(); }
	 * 
	 * @Pointcut("execution(public void set*(*))") public void pc2() { }
	 * 
	 * @Pointcut("execution(public void DrawShape())") public void pc3() {
	 * 
	 * }
	 * 
	 * @Before("pc1() || pc2() || pc3()") public void Demoadvice5() {
	 * System.out.println("Demo advice5 called"); }
	 */
	@Pointcut("execution(public void SpringDemo.DemoAoP.POJO  .*.set*(*,*))") 
    public void pc5() {

    }
	@Before("pc5()")
	public void Demoadvice6(JoinPoint jp) {
		System.out.println("DEmo Advice6 is called"+jp.toString());
	}
//	@Before("args(val)")
//	public void getValue(int val) {
//		System.out.println("VAlue obtained: "+val);
//	}
//	@AfterReturning("execution(public void checkRadius())")
//	public void DemoAdvice7() {
//		System.out.println("Advice 7 called");
//	}
//	@AfterThrowing("execution(public void checkRadius2())")
//	public void DemoAdvice8() {
//		System.out.println("Advice 8 called");
//	}
}
