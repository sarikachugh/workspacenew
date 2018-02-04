package springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingAppold {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		
		//BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle2");
		triangle.draw();

	}

}
