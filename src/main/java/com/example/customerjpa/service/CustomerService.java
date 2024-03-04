package com.example.customerjpa.service;

import com.example.customerjpa.model.Customer;
import com.example.customerjpa.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepo customerRepo;
    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepo.save(customer);

    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
