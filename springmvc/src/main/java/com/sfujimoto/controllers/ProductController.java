package com.sfujimoto.controllers;
/* sfujimoto: 2017/03/21 11:15 */

import com.sfujimoto.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String listProducts(Model model) {

        model.addAttribute("products", productService.listAllProducts());

        return "products";
    }
}
