package controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.ProductService;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private ProductService productService;

    @GetMapping("/admin/products")
    public String showProductList(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "admin/productList"; // JSP dla listy produktów w panelu administratora
    }
}

// Inne metody obsługujące dodawanie, edycję i usuwanie produktów przez administratora
