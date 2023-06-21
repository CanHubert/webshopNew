<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Shopping Cart</title>
</head>
<body>
<h1>Shopping Cart</h1>

<a href="../index.jsp">Back to Home</a>
<a href="../login.jsp">Login</a>
<a href="../registration.jsp">Register</a>
<a href="../products.jsp">View Products</a>


<table>
  <tr>
    <th>Product Name</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Total</th>
    <th>Action</th>
  </tr>
  <%-- Iterating over the cart items from the servlet --%>
  <c:forEach var="item" items="${cartItems}">
    <tr>
      <td>${item.product.name}</td>
      <td>${item.product.price}</td>
      <td>${item.quantity}</td>
      <td>${item.product.price * item.quantity}</td>
      <td><a href="removeFromCart?itemId=${item.id}">Remove</a></td>
    </tr>
  </c:forEach>
</table>

<h3>Total: ${total}</h3>

<form method="POST" action="checkout">
  <input type="submit" value="Checkout">
</form>
</body>
</html>