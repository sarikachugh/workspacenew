<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>

<p><a href="/firstmvc/admissionForm.html?siteTheme=green">Green </a> |
<a href="/firstmvc/admissionForm.html?siteTheme=red">Red </a></p>

<a href="/firstmvc/admissionForm.html?sitelanguage=en">English </a> |
<a href="/firstmvc/admissionForm.html?sitelanguage=fr">French </a>
<%-- <h1>${hdrmsg} </h1> --%>
<h1><spring:message code="label.hdrmsg" /></h1>
<h3> <spring:message code="label.admissionForm" /></h3>

<form:errors path="student1.*"/>

<form action="submitAdmissionForm.html" method="post">
	<table>
	<tr>
		<td><spring:message code="label.studentName" /></td> <td><input type="text"  name="studentName" /> </td>
	</tr>
	
	<tr>
		<td><spring:message code="label.studentHobby" /></td> <td><input type ="text" name="studentHobby" /> </td>
	</tr>
	
	<tr>
		<td><spring:message code="label.studentMobile" /></td> <td><input type ="text" name="studentMobile" /> </td>
	</tr>
	
	<tr>
		<td><spring:message code="label.studentDOB" /></td> <td><input type ="text" name="studentDOB" /> </td>
	</tr>	
	
	<tr>
		<td><spring:message code="label.studentSkills" /></td> <td> <select name="studentSkills" multiple>
													<option value="Java Core">Java Core</option>
													<option value="Spring Core">Spring Core</option>
													<option value="Spring MVC">Spring MVC</option>						
													</select></td>
	</tr>
	
	</table>	
	
	<table>
	<tr> <td><spring:message code="label.studentAddress" /></td></tr>
	<tr>
	<td><spring:message code="label.country" /><input type ="text" name="studentAddress.country"/></td>
	<td><spring:message code="label.city" /><input type ="text" name="studentAddress.city"/></td>
	<td><spring:message code="label.street" /><input type ="text" name="studentAddress.street"/></td>
	<td><spring:message code="label.pincode" /><input type ="text" name="studentAddress.pincode"/></td>
	</tr>
	<tr><td>
	<spring:message code="label.submit.admissionForm" var="labelSubmitAdmissionForm"></spring:message>
	<input type="submit" value = "${labelSubmitAdmissionForm}" /></td></tr>
	
	</table>
	

</form>

</body>
</html>