package springframework;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*Aware Interfaces:
Application Even publisher aware 
Bean classloader aware
Bean Name Aware*/

public class Triangleold4 implements ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;

	public Point getPointA() {
		Point pointA = (Point) context.getBean("pointA");
		return pointA;
	}

	/*public void setPointA(Point pointA) {
		this.pointA = pointA;
	}*/

	public Point getPointB() {
		Point pointB = (Point) context.getBean("pointB");
		return pointB;
	}

	/*public void setPointB(Point pointB) {
		this.pointB = pointB;
	}*/

	public Point getPointC() {
		Point pointC = (Point) context.getBean("pointC");
		return pointC;
	}

	/*public void setPointC(Point pointC) {
		this.pointC = pointC;
	}*/

	public void draw() {
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");

	}

	public void setApplicationContext(ApplicationContext context) 
			throws BeansException {
		this.context = context;
		
	}

	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
		
	}

}
