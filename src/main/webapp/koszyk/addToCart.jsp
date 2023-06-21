<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Add to Cart</title>
</head>
<body>
<h1>Add to Cart</h1>

<form method="POST" action="addToCart">
  <label for="productId">Product ID:</label>
  <input type="text" name="productId" id="productId" required><br>

  <label for="quantity">Quantity:</label>
  <input type="number" name="quantity" id="quantity" required><br>

  <input type="submit" value="Add to Cart">
</form>
</body>
</html>
