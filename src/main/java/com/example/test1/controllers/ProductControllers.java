package com.example.test1.controllers;


import com.example.test1.models.Product;
import com.example.test1.models.TimeSheet;
import com.example.test1.models.TransPortation;
import com.example.test1.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductControllers {

    @Autowired
    EmployeeService employeeService;

    ArrayList<Product> products = new ArrayList<>();

    @GetMapping( path = "/product")
    public  ArrayList<Product> products(){

        Product product1 = new Product();

        System.out.println(product1.toString());

        products.add(product1);
        return products;
    }

    @PostMapping(path = "/timesheet")
    public boolean timesheet(@RequestBody Product req) throws Exception {
        System.out.println(req.toString());
        // คำนวนวันมาทำงาน
        int num = req.getTimesheet().size();
        ArrayList<TimeSheet> sheet = req.getTimesheet();

        System.out.println("sheet = " + sheet);
        int day = 0;
        for (int i = 0; i < num; i++) {
            if (sheet.get(i).getStatus().equals("active")) {
                day = day + 1;
            }
        }
            System.out.println(day);
        // คำนวนค่าเดินทาง
        int num1 = req.getTransportation().size();
        ArrayList<TransPortation> trans = req.getTransportation();
        int price =0;
        for( int i=0; i< num1; i++){

            price = price + Integer.parseInt(trans.get(i).getBike_back()) + Integer.parseInt(trans.get(i).getBike_go()) + Integer.parseInt(trans.get(i).getBts_back())  + Integer.parseInt(trans.get(i).getBts_go())  + Integer.parseInt(trans.get(i).getBus_back()) + Integer.parseInt(trans.get(i).getBus_go()) + Integer.parseInt(trans.get(i).getMrt_back()) + Integer.parseInt(trans.get(i).getMrt_go()) + Integer.parseInt(trans.get(i).getTaxi_back()) + Integer.parseInt(trans.get(i).getTaxi_go()) + Integer.parseInt(trans.get(i).getVan_back()) + Integer.parseInt(trans.get(i).getVan_go());
        }
        boolean msg = employeeService.addEmployee(req);
//        boolean msg1 = employeeService.addEmployee1(req);
        System.out.println(price);
        return msg;
    }



}
