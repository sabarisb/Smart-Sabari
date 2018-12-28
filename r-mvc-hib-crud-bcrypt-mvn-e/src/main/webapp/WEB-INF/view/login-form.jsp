<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>User Login</title>
	</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>User Login</h2>
		</div>
	</div>

	<div id="container">

	
		<form:form action="validateUser" modelAttribute="user" method="POST">
		
			<table>
				<tbody>
					<tr>
						<td><label>User name:</label></td>
						<td><form:input path="userName" /></td>
					</tr>
				
					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" /></td>
					</tr>


					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Login" class="save" /></td>
					</tr>
				</tbody>
			</table>
		
		
		</form:form>
	
	
	</div>

</body>

</html>










