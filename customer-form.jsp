<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save </title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>EMI CALCULATOR</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save </h3>
	
		<form:form action="save" modelAttribute="AMOUNT" method="POST">
		
			<table>
				<tbody>
					<tr>
						<td><label>LOAN_AMOUNT:</label></td>
						<td><form:input path="LOAN_AMOUNT" /></td>
					</tr>
				
					<tr>
						<td><label>RATE_OF_INTEREST:</label></td>
						<td><form:input path="RATE_OF_INTEREST" /></td>
					</tr>

					<tr>
						<td><label>TENURE:</label></td>
						<td><form:input path="TENURE" /></td>
					</tr>
					
						<tr>
						<td><label>NO_OF_INSTALLMENT:</label></td>
						<td><form:input path="NO_OF_INSTALLMENT" /></td>
					</tr>
					

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="OK" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










