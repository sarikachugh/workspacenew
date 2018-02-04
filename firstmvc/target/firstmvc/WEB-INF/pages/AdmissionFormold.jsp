<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<h1>${hdrmsg} </h1>
<h2> Student Admission Form For Engineering Courses</h2>

<form action="submitAdmissionForm.html" method="post">
	<p>
		Student's Name : <input type="text"  name="studentName" />
	</p>
	<p>
		Student's Hobby : <input type ="text" name="studentHobby" />
	</p>
	<input type="submit" value = "submit this form by clicking here" />
	

	
</form>

</body>
</html>