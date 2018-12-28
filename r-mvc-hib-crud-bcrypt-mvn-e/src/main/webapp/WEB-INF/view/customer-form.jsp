  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	<title>Save Customer</title>
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
		<h2>WELCOME TO CUSTOMER  PAGE</h2>
		</div>
	</div>   

	<div id="container">
		<h3>Save Customer</h3>
	
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		
			<table>
				<tbody>
					<tr>
						<td><label>Customer_id:</label></td>
						<td><form:input path="Customer_id" /></td>
					</tr>
				
					<tr>
						<td><label>Customer_name:</label></td>
						<td><form:input path="Customer_name" /></td>
					</tr>

					<tr>
						<td><label>Customer_address:</label></td>
						<td><form:input path="Customer_address" /></td>
					</tr>
					
					<tr>
						<td><label>Customer_pincode:</label></td>
						<td><form:input path="Customer_pincode" /></td>
					</tr>
					<tr>
						<td><label>Customer_email:</label></td>
						<td><form:input path="Customer_email" /></td>
					</tr>
					
					
					<tr>
						<td><label>Contact_number:</label></td>
						<td><form:input path="Contact_number" /></td>
					</tr>
					
					<tr>
						<td><label>Registration_date:</label></td>
						<td><form:input path="Registration_date" /></td>
					</tr>
					
					<tr>
						<td><label>Created_by:</label></td>
						<td><form:input path="Created_by" /></td>
					</tr>
					<tr>
						<td><label>Modified_date:</label></td>
						<td><form:input path="Modified_date" /></td>
					</tr>
					
					
					

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="submit" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
	<%-- 	<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	 --%>
	</div>

</body>

</html>








