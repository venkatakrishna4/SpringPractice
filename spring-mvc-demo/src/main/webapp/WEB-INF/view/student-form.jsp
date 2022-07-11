<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <form:form action="processForm" modelAttribute="student"> 
	 	First Name: <form:input path="firstName" />
	 	<br>
	 	Last Name: <form:input path="lastName" />
	 	<br>
	 	<form:select path="country">
	 		Country: <form:options items="${student.countryOptions }"/>
	 	</form:select>
	 	<br>
	 	Favorite Language:
	 	Java <form:radiobutton path="favoriteLanguage" value="Java" />
	 	C# <form:radiobutton path="favoriteLanguage" value="C#" />
	 	PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
	 	Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
	 	<br><br>
	 	Operating Systems:
	 	Linux <form:checkbox path="operatingSystems" value="Linux" />
	 	Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
	 	Windows <form:checkbox path="operatingSystems" value="Windows" />
	 	<br><br>
	 	<input type="submit" value="submit"/>
	 </form:form>
</body>
</html>