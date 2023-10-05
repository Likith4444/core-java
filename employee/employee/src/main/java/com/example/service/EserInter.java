package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.EmployeeEntityt;

public interface EserInter {
	public EmployeeEntityt save(EmployeeEntityt en) ;

	public EmployeeEntityt getAll(int id);

	public EmployeeEntityt update(EmployeeEntityt ent);

	public EmployeeEntityt delete(int id);
}
