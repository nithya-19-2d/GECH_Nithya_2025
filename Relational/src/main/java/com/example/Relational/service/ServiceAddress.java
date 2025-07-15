package com.example.Relational.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Relational.employeemodel.Address;
import com.example.Relational.employeemodel.Department;
import com.example.Relational.repository.Addressrepository;

@Service
public class ServiceAddress {
	
	private Addressrepository reposite;
	
	
	public ServiceAddress(Addressrepository reposite) {
		super();
		this.reposite = reposite;
	}

	public List<Address> getAll() {
        return reposite.findAll();
    }
	
	public Address getById(Long id) {
        return reposite.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }
	
	public Address save(Address address) {
		return reposite.save(address);
	}

}
