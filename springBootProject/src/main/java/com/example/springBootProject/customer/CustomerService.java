package com.example.springBootProject.customer;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * customer Service layout
 * @author renxw
 * @version 20180725
 */

@Service
public class CustomerService {
   
	@Autowired
	private Config config;
	
	public String home(){
		List<String> servers = config.getServers();
		System.err.println(servers.toString());
		return "Hello World";
	}
}
