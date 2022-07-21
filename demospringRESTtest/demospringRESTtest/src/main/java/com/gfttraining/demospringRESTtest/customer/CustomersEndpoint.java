package com.gfttraining.demospringRESTtest.customer;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersEndpoint {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("customers")
	Collection<Customer> getAll(){
		return customerRepository.findAll();
	}

}
