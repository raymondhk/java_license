<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Person</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->
	</head>

	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<h2>New Person</h2>
					<p><a href="/licenses/new">Add License</a></p>
					<form:form method="POST" action="/persons/new/" modelAttribute="person">
						<form:hidden path="id"/>
						<form:label path="firstName">First Name:
						<form:errors path="firstName"/>
						<form:input path="firstName" class="form-control"/></form:label>
						<br>
						<br>
						<form:label path="lastName">Last Name:
						<form:errors path="lastName"/>
						<form:input path="lastName" class="form-control"/></form:label>
						<br>
						<br>
						<input type="submit" value="Create" class="btn btn-success"/>
					</form:form>
				</div>
				<div class="col-md-6"></div>
			</div>
		</div>
	</body>
</html>