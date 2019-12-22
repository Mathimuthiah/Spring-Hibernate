<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!DOCTYPE html>

<html>
<head>
	<title>List Customers</title>
	<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>
<div id="wrapper" >
<div id="header">
<h2> Listing Customers</h2>
</div>
</div>

<div id="container">
<div id="content">
<input type="button" value="Add customer"
 onclick="window.location.href='showFormForAdd';return false;"
 class="add-button"/>
<table>
<tr>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>

</tr>



<!-- Loop to get customer from controller -->

<c:forEach  var="tempCust" items="${customers}">
<c:url var="updateLink" value="/customer/showFormForUpdate">
<c:param name="customerId" value="${tempCust.id}"/>
</c:url>
<c:url var="deleteLink" value="/customer/delete">
<c:param name="customerId" value="${tempCust.id}"/>
</c:url>
<tr>
<td>${tempCust.first_name }</td>
<td>${tempCust.last_name }</td>
<td>${tempCust.email }</td>
<td><a href="${updateLink}">Update</a>
|
<a href="${deleteLink}"
onclick="if(!(confirm('Are you sure you want to delete the customer'))) return false;">Delete</a></td>

<td>
</tr>

</c:forEach>


</table>
</div>
</div>


</body>
</html>









