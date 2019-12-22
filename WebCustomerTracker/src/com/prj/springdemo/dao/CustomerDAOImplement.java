package com.prj.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prj.springdemo.entity.Customer;
@Repository
public class CustomerDAOImplement implements CustomerDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query<Customer> query=session.createQuery("from Customer order by last_name",
				Customer.class);
		List<Customer> customers=query.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		session.delete(customer);
		
	}

}
