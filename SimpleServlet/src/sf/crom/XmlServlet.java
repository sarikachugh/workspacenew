package sf.crom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*@WebServlet(description = "A simple servlet", urlPatterns = { "/xmlServletpath" },
	initParams={@WebInitParam(name="defaultUser", value="John Doe")}
		)*/
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*String userName = request.getParameter("userName");*/
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != "" && userName != null){
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		/*out.println("Request parameter has username as " + userName);
		out.println("Session parameter has username as " + (String) session.getAttribute("savedUserName"));
		out.println("Context parameter has username as " + (String) context.getAttribute("savedUserName"));
		out.println("Init parameter has default username as " + getServletConfig().getInitParameter("defaultUser"));*/
		//this.getServletConfig().getInitParameter("defaultUser");
		//out.println("Hello from the GET method ! " +userName);
	}

	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("Hello from the POST method " + userName + "! We know your full name is " + fullName);
		String prof = request.getParameter("prof");
		out.println("You are a " + prof);
		//String location = request.getParameter("location");
		String [] location = request.getParameterValues("location");
		out.println("You are at " + location.length + " places");
		for (int i=0; i<location.length; i++) {
			out.println(location[i]);
		}*/
		
	/*}*/
}
//System.out.println("XML servlet called!");
//http://localhost:8091/SimpleServlet/xmlServletpath?userName=abs

////String userID = request.getParameter("userID");