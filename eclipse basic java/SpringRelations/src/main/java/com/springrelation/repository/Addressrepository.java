package com.springrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrelation.relationmodels.Address;

@Repository
public interface Addressrepository extends JpaRepository<Address, Integer>{

}
