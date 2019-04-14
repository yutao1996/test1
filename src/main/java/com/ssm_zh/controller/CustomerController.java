package com.ssm_zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm_zh.domain.Customer;
import com.ssm_zh.service.CustomerService;

@Controller
@RequestMapping("/cus")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/findBy")
	  public ModelAndView findById(Integer id){
        //׼������
        Customer cust = customerService.findById(id);
        //����ģ����ͼ����
        ModelAndView modelAndView  = new ModelAndView();
        //�������
        modelAndView.addObject("cust",cust);
        //ָ��ҳ��
        modelAndView.setViewName("show");
        return  modelAndView;
    }
	@RequestMapping("/register")
	public String register(Customer customer){
		System.out.println(1235646);
		customerService.register(customer);
		return "login";
	}
    @RequestMapping("/login")
    public String login(Customer customer) {
    	
    	customerService.login(customer);
    	return "show";
    }
}
