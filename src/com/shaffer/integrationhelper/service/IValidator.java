package com.shaffer.integrationhelper.service;

import java.util.List;
import java.util.*;

import org.springframework.stereotype.Service;

import com.shaffer.integrationhelper.model.InCodeEmployee;


@Service
public interface IValidator {
	
	public List<String> ICValidate(String enteredDepartments, String enteredEmployeeTypes, String enteredEmployeeStatus, String enteredPayPeriods, List<InCodeEmployee> employees);

}
