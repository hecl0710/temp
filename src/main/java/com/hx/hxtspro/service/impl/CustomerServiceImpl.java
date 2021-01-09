package com.hx.hxtspro.service.impl;

import com.alibaba.fastjson.JSON;
import com.hx.hxtspro.dao.CustomerMapper;
import com.hx.hxtspro.entity.Customer;
import com.hx.hxtspro.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Resource
    CustomerMapper customerMapper;

    @Override
    public List<Customer> queryCustomer(Customer customer) {
        log.info("查询客户列表：{}", JSON.toJSONString(customer));
        return customerMapper.queryCustomer(customer);
    }
}
