package springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;*/
//import org.springframework.beans.factory.annotation.Required;

//@Repository for data object --spring know --role bean is doing --functioning is same like
//@Service for service in enterprise application ---role bean is doing
//@Component for component behavior --generic --its a bean
//@Controller for mvc controller class ---role bean is doing

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getCenter() {
		return center;
	}
	/*@Required*/
	/*@Autowired
	@Qualifier("circleRelated")*/
	/*(name="pointC")*/
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Point Message", null));
		//System.out.println("Circle: point is: (" + center.getX() + ", " + center.getY() + ")");
		//System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy of Circle");
	}
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	

}
