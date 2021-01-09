package com.hx.hxtspro.dao;

import com.hx.hxtspro.entity.Customer;

import java.util.List;

public interface CustomerMapper {

//    int deleteByPrimaryKey(String custName);
//
//    int insert(Customer record);
//
//    int insertSelective(Customer record);
//
//    Customer selectByPrimaryKey(String custName);
//
//    int updateByPrimaryKeySelective(Customer record);
//
//    int updateByPrimaryKey(Customer record);
    List<Customer> queryCustomer(Customer customer);
}