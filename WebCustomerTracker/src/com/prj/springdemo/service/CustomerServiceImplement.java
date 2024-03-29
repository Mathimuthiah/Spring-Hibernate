package com.prj.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prj.springdemo.dao.CustomerDAO;
import com.prj.springdemo.entity.Customer;
@Service
public class CustomerServiceImplement implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
				
		return customerDAO.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		 customerDAO.saveCustomer(customer);
		
	}
	@Override
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}
	@Override
	@Transactional

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		 customerDAO.deleteCustomer(id);
	}

}
