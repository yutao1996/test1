package com.ssm_zh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm_zh.dao.CustomerDao;
import com.ssm_zh.domain.Customer;
import com.ssm_zh.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}
	public void register(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.register(customer);
	}
	public void login(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.login(customer);
	}

}
