package com.ssm_zh.service;

import com.ssm_zh.domain.Customer;

public interface CustomerService {
 public Customer findById(Integer id);

public void register(Customer customer);

public void login(Customer customer);
}
