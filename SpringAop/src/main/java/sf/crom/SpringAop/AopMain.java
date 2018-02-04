package sf.crom.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sf.crom.SpringAop.service.FactoryService;
import sf.crom.SpringAop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);*/
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
		
		//shapeService.getCircle().setNameandReturn("Dummy Name");
		shapeService.getCircle();
		//shapeService.getCircle().setName("Dummy Name");
		//System.out.println(shapeService.getCircle().getName());
		//System.out.println(shapeService.getTriangle().getName());

	}

}
