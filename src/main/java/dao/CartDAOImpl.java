package dao;

import entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CartDAOImpl implements CartDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Cart getCartById(Long cartId) {
        return entityManager.find(Cart.class, cartId);
    }

    @Override
    public void createCart(Cart cart) {
        entityManager.persist(cart);
    }

    @Override
    public void updateCart(Cart cart) {
        entityManager.merge(cart);
    }

    @Override
    public void deleteCart(Long cartId) {
        Cart cart = getCartById(cartId);
        if (cart != null) {
            entityManager.remove(cart);
        }
    }
}
