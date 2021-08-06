package com.stancu.customerrestapi.service;

import com.stancu.customerrestapi.dao.CustomerDaoImpl;
import com.stancu.customerrestapi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDaoImpl customerDao;

    public List<Customer> getCustomers() {

        return customerDao.getCustomers();
    }


    public void saveCustomer(Customer theCustomer) {
        customerDao.saveCustomer(theCustomer);
    }


    public Customer getCustomer(int theId) {
        return customerDao.getCustomer(theId);
    }

    public void deleteCustomer(int theId) {
        customerDao.deleteCustomer(theId);
    }

    public void updateCustomer(Customer newCustomer,int theId) {
        customerDao.updateCustomer(newCustomer,theId);
    }
}
