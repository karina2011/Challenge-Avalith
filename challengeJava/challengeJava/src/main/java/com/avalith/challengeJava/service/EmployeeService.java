package com.avalith.challengeJava.service;

import com.avalith.challengeJava.model.Employee;
import com.avalith.challengeJava.model.Vote;
import com.avalith.challengeJava.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class EmployeeService {
    private IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService (IEmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public Employee get_by_id (Integer id){
        return employeeRepository.findById(id).orElseThrow(()->new HttpClientErrorException(HttpStatus.NO_CONTENT));
    }

    public List<Employee> get_all_employee (){
        return employeeRepository.findAll();
    }

    public void add_employee(Employee one_employee) {
        this.employeeRepository.save(one_employee);
    }

    public Employee getById(Integer id_employee) {
        return this.employeeRepository.findById(id_employee)
                                       .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NO_CONTENT));
    }

    public List<Vote> getVoteEmployee (Integer id){

        return getById(id).getVotes();
    }
}
