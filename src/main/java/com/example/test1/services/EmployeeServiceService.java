package com.example.test1.services;

import com.example.test1.models.Product;
import com.example.test1.models.TimeSheet;

import java.util.ArrayList;

public interface EmployeeServiceService {
    public ArrayList<Product> getEmployees() throws Exception;
    public boolean addEmployee(Product request) throws Exception;
//    public boolean addEmployee1(TimeSheet request) throws Exception;
    public String updateEmployee(Product request) throws Exception;
    public String deleteEmployee(String id) throws Exception;
    public String update(String id) throws Exception;

}
