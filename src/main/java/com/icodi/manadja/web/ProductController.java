package com.icodi.manadja.web;

import com.icodi.manadja.entities.Product;
import com.icodi.manadja.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/index")
    public String listProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("listOfProducts", products);
        return "list-products";
    }

    @GetMapping("/")
    public String accueil() {
        return "redirect:/index"; //return "accueil";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(name = "id") Long id) {
        productRepository.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/createProduct")
    public String createProduct(Model model) {
        model.addAttribute("newProduct", new Product());
        return "create-product";
    }



}
