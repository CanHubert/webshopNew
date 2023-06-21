package dao;

import entity.Product;

import java.util.List;

public interface ProductDAO {
    Product getProductById(Long productId);
    List<Product> getAllProducts();
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long productId);
}
