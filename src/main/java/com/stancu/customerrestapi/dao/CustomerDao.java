package com.stancu.customerrestapi.dao;

import com.stancu.customerrestapi.model.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);


    void deleteCustomer(int theId);

    void updateCustomer(Customer newCustomer, int theId);
}
