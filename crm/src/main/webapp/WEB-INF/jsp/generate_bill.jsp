<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create bill</title>
</head>
<body>
<h2> Create bill</h2>
<form action="save" method="post">
<pre>
First Name<input type="text" name="firstName" value="${contact.firstName}"/>
Last Name<input type="text" name="lastName" value="${contact.lastName}"/>
Email<input type="text" name="email"value="${contact.email}"/>
Mobile<input type="text" name="mobile" value="${contact.mobile}"/>

<input type="submit" value="save"/>
</pre>

</form>
</body>
</html>>