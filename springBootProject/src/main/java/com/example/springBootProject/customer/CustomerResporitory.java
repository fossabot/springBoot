package com.example.springBootProject.customer;

import org.springframework.data.repository.Repository;
/**
 * customer dao
 * @author renxw
 * @version 20180725
 */

public interface CustomerResporitory extends Repository<Customer,Long> {
	
	Customer findByNameAndAge(String name,Long age);
	
}
