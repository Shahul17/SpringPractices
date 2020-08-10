  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Viewing User Details</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Age</th>
    <c:forEach var="customer" items="${customers}"> 
    <tr>
    <td>${customer.id}</td>
    <td>${customer.name}</td>
    <td>${customer.age}</td>
   
    </tr>
    </c:forEach>
    </table>
    <br/>