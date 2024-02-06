package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ctrl+shift+O

public class Test {
	// main   ctrl+space   enter
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("/SpringFirstApp/src/main/resources/config.xml");
		OracleCon con = (OracleCon) ac.getBean("con");
		System.out.println(con);
	}
}
