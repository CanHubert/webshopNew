package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CheckoutController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public String checkout(HttpSession session) {
        User user = (User) session.getAttribute("user");
        orderService.createOrder(user.getId());
        return "redirect:/order/success"; // Przekierowanie do strony z potwierdzeniem zamówienia
    }
}
