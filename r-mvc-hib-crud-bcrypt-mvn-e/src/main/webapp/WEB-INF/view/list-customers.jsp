<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List Customers</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<!-- 
Refresh page every 5 seconds -->
<!-- <script type="text/javascript">
  setInterval("my_function();",10000); 
 
    function my_function(){
        window.location = location.href;
    }
</script> -->

<!-- reference our style sheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>WELCOME</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<!-- put new button: Add Customer -->

			<input type="button" value="Add Customer" class="btn btn-danger"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button" />

			<!--  add our html table here -->

			<table>
				<tr>
					<th>Customer_id</th>
					<th> Customer_name</th>
					<th>Customer_address</th>
					<th>Customer_pincode</th>
					<th>Customer_email</th>
					<th>Contact_number</th>
					<th>Registration_date</th>
					<th>Created_by</th>
					<th>Modified_date</th>
					
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">

					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.Customer_id}" />
					</c:url>


					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempCustomer.Customer_id}" />
					</c:url>
					<tr>
						<td>${tempCustomer.Customer_id}</td>
						<td>${tempCustomer.Customer_name}</td>
						<td>${tempCustomer.Customer_address}</td>
                        <td>${tempCustomer.Customer_pincode }</td>
                        <td>${tempCustomer.Customer_email }</td>
                        <td>${tempCustomer.Contact_number }</td>
                        <td>${tempCustomer.Registration_date }</td>
                        <td>${tempCustomer.Created_by }</td>
                        <td>${tempCustomer.Modified_date }</td>
                 
							<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false" >Delete</a>
						</td>
					</tr>

				</c:forEach>

			</table>

		</div>

	</div>


</body>

</html>









