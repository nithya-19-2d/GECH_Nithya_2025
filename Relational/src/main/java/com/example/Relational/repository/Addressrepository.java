package com.example.Relational.repository;

import java.lang.foreign.Linker.Option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Relational.employeemodel.Address;

@Repository
public interface Addressrepository extends JpaRepository<Address, Long> {

}
