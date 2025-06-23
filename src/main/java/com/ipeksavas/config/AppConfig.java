package com.ipeksavas.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ipeksavas.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","ipek","savas"));
		employeeList.add(new Employee("2","esen","guven"));
		employeeList.add(new Employee("3","arda","murat"));
		employeeList.add(new Employee("4","hasan","baybuz"));
		employeeList.add(new Employee("5","emircan","unal"));
		employeeList.add(new Employee("10","ipek","yildiz"));
		return employeeList;
	}
}
