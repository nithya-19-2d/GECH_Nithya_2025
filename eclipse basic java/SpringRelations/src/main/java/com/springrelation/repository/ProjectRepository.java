package com.springrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrelation.relationmodels.Projects;

@Repository
public interface ProjectRepository extends JpaRepository<Projects, Integer>{

}
