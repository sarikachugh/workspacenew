<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Testing JSPs</</h3>

<%!                               //definition tag: method declaration tag with exclamation
public int add (int a, int b){           //these are available to all script tags mentioned in jsp
	return a + b;                 //for all methods declaration as no of methods as we want
}                                //this method cant be in the script tag it throw 500 exception

%>

<%                              //script tags as number of script tag as per requirement
                        //these are available to all script tags mentioned in jsp
                         //for all methods declaration as no of methods as we want
 
int i = 1;
int j = 2;
int k;

k = i + j;

/* out.println("Value of k is " + k); */

%>          
                                      
The value of k is: <%=1+2 %>!!          

<%           //static and dynamic element are rendering
k = add(1000, 3009);
%>

<br>

The value of k is: <%=k %>!!

<%
for(i=0; i<5; i++) {
	/* out.println("<br> i = " + i);
}
 */
%>
	<br> The new value of i = <%=i%>

<%}%>

</body>
</html>