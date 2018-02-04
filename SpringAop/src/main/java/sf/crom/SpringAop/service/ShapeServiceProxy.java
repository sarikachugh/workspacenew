package sf.crom.SpringAop.service;

import sf.crom.SpringAop.aspect.LoggingAspect;
import sf.crom.SpringAop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		
		new LoggingAspect().loggingAdvice();
		
		return super.getCircle();
	}	
	
}
