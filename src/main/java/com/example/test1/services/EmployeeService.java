package com.example.test1.services;

import com.example.test1.models.Product;
import com.example.test1.models.TimeSheet;
import com.example.test1.repositories.Employee1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class EmployeeService implements EmployeeServiceService{

    @Autowired
    Employee1Repository employee1Repository;


    @Override
    public ArrayList<Product> getEmployees() throws Exception {
        return null;
    }

    @Override
    public boolean addEmployee(Product request) throws Exception {
        boolean msg = employee1Repository.addEmployee(request);
        return msg;
    }

//    @Override
//    public boolean addEmployee1(TimeSheet request) throws Exception {
//        boolean msg = employee1Repository.addEmployee1(request);
//        return false;
//    }


    @Override
    public String updateEmployee(Product request) throws Exception {
        return null;
    }

    @Override
    public String deleteEmployee(String id) throws Exception {
        return null;
    }

    @Override
    public String update(String id) throws Exception {
        return null;
    }
}
