package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.UserService;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // JSP dla formularza rejestracji
    }

    @PostMapping("/register")
    public String processRegistrationForm(@ModelAttribute User user) {
        // Walidacja danych
        if (!userService.isUsernameAvailable(user.getUsername())) {
            // Obsługa błędu - nazwa użytkownika jest już zajęta
            return "register"; // JSP dla formularza rejestracji z błędem
        }

        // Utworzenie nowego użytkownika
        userService.registerUser(user);
        return "redirect:/login"; // Przekierowanie do strony logowania po rejestracji
    }
}