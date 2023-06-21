package dao;

import entity.Cart;

public interface CartDAO {
    Cart getCartById(Long cartId);
    void createCart(Cart cart);
    void updateCart(Cart cart);
    void deleteCart(Long cartId);
}
