<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Adding Customers</title>
	<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}/resources/css/style.css">
	
	<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
<div id="wrapper" >
<div id="header">
<h2> Customer Data</h2>
</div>
</div>

<div id="container">
<div id="content">
<form:form action="saveCustomer" modelAttribute="new_customer" method="POST" >
<form:hidden path="id"/>
<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="first_name" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="last_name" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
</form:form>
<div style="clear; both;"></div>
		
<p><a href="${pageContext.request.contextPath}/customer/list">BACK TO LIST</a></p>
</div></div>

</body></html>