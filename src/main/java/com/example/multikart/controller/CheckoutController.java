package com.example.multikart.controller;

import com.example.multikart.domain.dto.CheckoutRequestDTO;
import com.example.multikart.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/checkout")
public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;

    @GetMapping
    public String view(HttpSession session, Model model) {
        return checkoutService.view(session, model);
    }

    @PostMapping
    public String checkout(@ModelAttribute("checkout") CheckoutRequestDTO input, BindingResult result, HttpSession session, Model model, RedirectAttributes redirect) {
        return checkoutService.checkout(input, result, session, model, redirect);
    }

}
