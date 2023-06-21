<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<a href="index.jsp">Back to Home</a>
<a href="login.jsp">Login</a>
<a href="registration.jsp">Register</a>
<a href="koszyk/cart.jsp">View Cart</a>


<table>
  <tr>
    <th>Name</th>
    <th>Price</th>
    <th>Action</th>
  </tr>
  <%-- Iterating over the list of products from the servlet --%>
  <c:forEach var="product" items="${products}">
    <tr>
      <td>${product.name}</td>
      <td>${product.price}</td>
      <td><a href="addToCart?productId=${product.id}">Add to Cart</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
