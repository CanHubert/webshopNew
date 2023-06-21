package service;

import entity.Cart;
import org.springframework.stereotype.Repository;
import repository.CartRepository;

@Repository
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void removeCart(Cart cart) {
        cartRepository.delete(cart);
    }

}

