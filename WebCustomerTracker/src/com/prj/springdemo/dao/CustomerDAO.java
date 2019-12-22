package com.prj.springdemo.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prj.springdemo.entity.Customer;
public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

}
