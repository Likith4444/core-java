package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EmployeeEntityt;

public interface Erepo extends JpaRepository<EmployeeEntityt, Integer> {

}
