<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<a href="index.jsp">Back to Home</a>
<a href="registration.jsp">Register</a>
<a href="products.jsp">View Products</a>
<a href="koszyk/cart.jsp">View Cart</a>


<form method="POST" action="login">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" required><br>

    <label for="password">Password:</label>
    <input type="password" name="password" id="password" required><br>

    <input type="submit" value="Login">
</form>
</body>
</html>
