package com.avisys.cim.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.avisys.cim.entity.Customer;
import com.avisys.cim.services.CustomerService;

@RestController
public class CustomerController {

	// Injecting CustomerService dependency
	@Autowired
	CustomerService customer_service;
	
	/**
     * Get all customers.
     */
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return customer_service.getAllCustomers();
	}
	
	/**
     * Get customer by filter using first name, last name, and or mobile number.
     */
	@GetMapping("/find-customer")
    public List<Customer> findACustomer(@RequestParam(required = false) String firstName,@RequestParam(required = false) String lastName,@RequestParam(required = false) String number) {
        return customer_service.findCustomer(firstName, lastName, number);
    }
	
	
	
}

