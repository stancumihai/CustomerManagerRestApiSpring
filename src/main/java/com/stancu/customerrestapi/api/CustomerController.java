package com.stancu.customerrestapi.api;

import com.stancu.customerrestapi.exception.NotFoundException;
import com.stancu.customerrestapi.model.Customer;
import com.stancu.customerrestapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {

        return customerService.getCustomers();
    }

    @PostMapping("/customers")
    public void saveCustomer(@RequestBody Customer theCustomer) {
        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable("id") int theId) {
        Customer customer = customerService.getCustomer(theId);
        if (customer == null) {
            throw new NotFoundException("Customer not found");
        }
        return customer;
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable("id") int theId) {
        Customer customer = customerService.getCustomer(theId);
        if (customer == null) {
            throw new NotFoundException("Customer not found");
        }
        customerService.deleteCustomer(theId);
    }

    @PutMapping("/customers/{id}")
    public void updateCustomer(@RequestBody Customer newCustomer, @PathVariable("id") int theId) {
        Customer customer = customerService.getCustomer(theId);
        if (customer == null) {
            throw new NotFoundException("Customer not found");
        }
        customerService.updateCustomer(newCustomer, theId);
    }
}
