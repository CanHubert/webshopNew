<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<a href="index.jsp">Back to Home</a>
<a href="login.jsp">Login</a>
<a href="products.jsp">View Products</a>
<a href="koszyk/cart.jsp">View Cart</a>


<form method="POST" action="register">
  <label for="username">Username:</label>
  <input type="text" name="username" id="username" required><br>

  <label for="password">Password:</label>
  <input type="password" name="password" id="password" required><br>

  <input type="submit" value="Register">
</form>
</body>
</html>
