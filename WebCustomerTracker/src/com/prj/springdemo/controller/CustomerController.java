package com.prj.springdemo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prj.springdemo.dao.CustomerDAO;
import com.prj.springdemo.entity.Customer;
import com.prj.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")//@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> customers=customerService.getCustomers();
		theModel.addAttribute("customers",customers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model themodel)
	{
		Customer customer=new Customer();
		themodel.addAttribute("new_customer", customer);
		
		return "customer-form";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer (@ModelAttribute("new_customer") Customer customer)
	{
		
		customerService.saveCustomer(customer);
	return "redirect:/customer/list";	
	}
	@GetMapping("/showFormForUpdate")
	public String updateCustomer(@RequestParam("customerId") int id,
			Model themodel)
	{
		Customer cust=customerService.getCustomer(id);
		themodel.addAttribute("new_customer", cust);
		return "customer-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int id,
			Model themodel)
	{
		customerService.deleteCustomer(id);
		
		return "redirect:/customer/list";
	}
	
	
}


