package com.example.customerjpa.controller;

import com.example.customerjpa.model.Customer;
import com.example.customerjpa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("")
    public String home(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customers", new Customer());
        return "create";
    }
    @PostMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "redirect:/customers";
    }

}
