<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Checkout</title>
</head>
<body>
<h1>Checkout</h1>

<h3>Order Summary:</h3>
<table>
  <tr>
    <th>Product Name</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Total</th>
  </tr>
  <%-- Iterating over the cart items from the servlet --%>
  <c:forEach var="item" items="${cartItems}">
    <tr>
      <td>${item.product.name}</td>
      <td>${item.product.price}</td>
      <td>${item.quantity}</td>
      <td>${item.product.price * item.quantity}</td>
    </tr>
  </c:forEach>
</table>

<h3>Total: ${total}</h3>

<form method="POST" action="placeOrder">
  <label for="fullName">Full Name:</label>
  <input type="text" name="fullName" id="fullName" required><br>

  <label for="address">Address:</label>
  <input type="text" name="address" id="address" required><br>

  <input type="submit" value="Place Order">
</form>
</body>
</html>
