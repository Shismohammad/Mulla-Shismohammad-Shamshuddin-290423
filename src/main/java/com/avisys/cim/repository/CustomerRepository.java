package com.avisys.cim.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.avisys.cim.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query("SELECT c FROM Customer c WHERE LOWER(c.firstName) LIKE LOWER(CONCAT('%', :firstName, '%')) " +"AND LOWER(c.lastName) LIKE LOWER(CONCAT('%', :lastName, '%')) " +"AND c.mobileNumber = :mobileNumber")
    List<Customer> findACustomer(@Param("firstName") String firstName,@Param("lastName") String lastName,@Param("mobileNumber") String number);
	Customer findByMobileNumber(String number);

	
}
