package com.hx.hxtspro.controller;

import com.hx.hxtspro.entity.Customer;
import com.hx.hxtspro.service.CustomerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Resource
    CustomerService customerService;

    @RequestMapping("query")
    public List<Customer> queryCustomerHandle(@RequestBody Customer customer){
        return customerService.queryCustomer(customer);
    }
}
