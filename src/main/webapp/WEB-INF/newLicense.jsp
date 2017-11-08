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
					<h2>New License</h2>
					<p><a href="/persons/new/">Add Person</a></p>
					<form:form method="POST" action="/licenses/new/" modelAttribute="license">
						<form:hidden path="id"/>
						<form:hidden path="number"/>
						<form:label path="${person.id}">Person:
						<form:errors path="${person.id}"/>
						<form:select path="${person.id}" class="form-control">
							<option value="" disabled selected>Select Name</option>
							<c:forEach items="${persons}" var="person">
								<option>${person.firstName} ${person.lastName}</option>
							</c:forEach> 
						</form:select>
						</form:label>
						<br>
						<form:label path="state">State:
						<form:errors path="state"/>
						<form:input path="state" class="form-control"/></form:label>
						<br>
						<br>
						<form:label path="expirationDate">Expiration Date:
						<form:errors path="expirationDate"/>
						<form:input type="date" path="expirationDate" class="form-control text-center"/></form:label>
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