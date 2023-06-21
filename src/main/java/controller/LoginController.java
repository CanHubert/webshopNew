package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // JSP dla formularza logowania
    }

    @PostMapping("/login")
    public String processLoginForm(@RequestParam String username, @RequestParam String password, HttpSession session) {
        User user = userService.authenticateUser(username, password);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/dashboard"; // Przekierowanie do strony po zalogowaniu
        } else {
            return "login"; // JSP dla formularza logowania z błędem logowania
        }
    }