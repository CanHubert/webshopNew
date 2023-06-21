package controller;

import entity.Product;
import entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.CartRepository;
import service.CartService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/cart")
public class CartController {
    private final CartRepository cartRepository;

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam Long productId, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Product product = productService.getProductById(productId);

        // Dodawanie produktu do koszyka
        cartService.addToCart(user.getId(), product);

        return "redirect:/cart"; // Przekierowanie do strony koszyka po dodaniu produktu
    }

    @PostMapping("/cart/checkout")
    public String checkoutCart(HttpSession session) {
        User user = (User) session.getAttribute("user");
        CartService.checkoutCart(user.getId());

        return "redirect:/cart/confirmation"; // Przekierowanie do strony potwierdzenia zamówienia
    }
}