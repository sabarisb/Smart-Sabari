<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>EMI CALCULATOR</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2> EMI CALCULATOR</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value=" ENTER EMI AMOUNT"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>LOAN_AMOUNT</th>
					<th>RATE_OF_INTEREST</th>
					<th>TENURE</th>
					<th>NO_OF_INSTALLMENT</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="emiCalculator" items="${amount}">
				
					<tr>
						<td> ${emiCalculator.loan_amount} </td>
						<td> ${emiCalculator.rate_of_interest} </td>
						<td> ${emiCalculator.tenure} </td>
						<td>${emiCalculator.no_of_installment }</td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









