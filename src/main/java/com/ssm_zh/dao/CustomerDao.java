package com.ssm_zh.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ssm_zh.domain.Customer;


public interface CustomerDao {
	@Select("Select * from customer where custId=#{id}")
    public Customer findById(Integer id);

	@Insert("Insert into customer values(#{custId},#{cName})") 
	public void register(Customer customer);

	@Select("select * from customer where custId=#{custId} and cName=#{cName}")
	public Customer login(Customer customer);
}
