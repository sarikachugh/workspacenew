package studentadmissioncontroller;



import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		
		//String exceptionOccured = "NULL_POINTER";
		//String exceptionOccured = "IO_EXCEPTION";
		
		String exceptionOccured = "ARITHMETIC_EXCEPTION";
		
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			
			throw new NullPointerException("Null Pointer Exception");
		
		}else if(exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")){
			throw new IOException("IO Exception");
		}else if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {
			
			throw new ArithmeticException("Arithmetic Exception");
		}
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		//model.addObject("hdrmsg", "Gontu College of Engineering, India");
		return model;
		
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		
		model.addAttribute("hdrmsg", "Gontu College of Engineering, India");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @Valid @ModelAttribute("student1") Student student, BindingResult result){
		
		if(result.hasErrors()) {
			
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("hdrmsg", "Gontu College of Engineering, India");
		
		return model;
	}
		
}


//Notes:
//public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="Mr. ABCXYZ") String name, @RequestParam("studentHobby") String hobby){