package com.example.Relational.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Relational.dto.Adressdto;

import com.example.Relational.employeemodel.Address;

import com.example.Relational.repository.Addressrepository;
import com.example.Relational.service.ServiceAddress;

@RestController
@RequestMapping("/api/Employeesaddress")
public class Addresscontroll {
	private Addressrepository reposite;
	private ServiceAddress serviceadd;
	
	public Addresscontroll(Addressrepository reposite, ServiceAddress serviceadd) {
		super();
		this.reposite = reposite;
		this.serviceadd = serviceadd;
	}

	@GetMapping
    public List<Address> getAll() {
        return reposite.findAll();
    }
	
	@GetMapping("/{id}")
    public Address getStudent(@PathVariable Long id) {
        return serviceadd.getById(id);
    }

    @PostMapping
    public Address createEmployee(@RequestBody Adressdto  dto) {
    	Address address = new Address(null, dto.getStreet(), dto.getCity(), dto.getEmployee());
        return serviceadd.save(address);
       
    }

}
