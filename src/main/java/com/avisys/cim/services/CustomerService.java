package com.avisys.cim.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avisys.cim.entity.Customer;
import com.avisys.cim.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customer_repo;
	
	public List<Customer> getAllCustomers() {
		return customer_repo.findAll();
	}

	public List<Customer> findCustomer(String firstName, String lastName, String number) {
        return customer_repo.findACustomer(firstName, lastName, number);
    }
    
  

}
