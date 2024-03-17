package org.example.controller;

import org.example.entities.Customer;
import org.example.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/getAll")
    public List<Customer> getAllCus(){
        return customerRepository.findAll();
    }
}
