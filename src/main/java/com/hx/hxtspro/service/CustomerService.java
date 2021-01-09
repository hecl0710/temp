package com.hx.hxtspro.service;

import com.hx.hxtspro.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> queryCustomer(Customer customer);
}
