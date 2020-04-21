package com.example.test1.repositories;


import com.example.test1.config.Config;
import com.example.test1.models.Product;
import com.example.test1.models.TimeSheet;
import com.example.test1.models.TransPortation;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

@Repository
public class EmployeeRespository implements Employee1Repository {


    private com.example.test1.models.TimeSheet TimeSheet;

    @Override
    public ArrayList<Product> getEmployees() throws Exception {
        return null;
    }

    @Override
    public boolean addEmployee(Product request) throws Exception {
        Connection c = null;
        PreparedStatement stm = null;
        boolean flag = false;

        Connection c1 = null;
        PreparedStatement stm1 = null;

        Connection c2 = null;
        PreparedStatement stm2 = null;

        try {
            c = DriverManager.getConnection(Config.url , Config.user , Config.password);
            c.setAutoCommit(false);

            StringBuffer sql = new StringBuffer("INSERT INTO employee (title , name , position , emp_id , month , year , start_period , end_period ,  site , approver , approver_site) VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )");
            stm = c.prepareStatement(sql.toString());
            stm.setString(1 , request.getTitle());
            stm.setString(2 , request.getName());
            stm.setString(3 , request.getPosition());
            stm.setString(4 , request.getEmp_id());
            stm.setString(5 , request.getMonth());
            stm.setString(6 , request.getYear());
            stm.setString(7 , request.getStart_period());
            stm.setString(8 , request.getEnd_period());
            stm.setString(9 , request.getSite());
            stm.setString(10 , request.getApprover());
            stm.setString(11 , request.getApprover_site());
            int clack = stm.executeUpdate();


            c1 = DriverManager.getConnection(Config.url , Config.user , Config.password);
            c1.setAutoCommit(false);

            ArrayList<TimeSheet> sheet = request.getTimesheet();
            StringBuffer sql_timesheet = new StringBuffer("INSERT INTO timesheet (status , project , task , comp , date , time_in , time_out , manday , remark) VALUES (?,?,?,?,?,?,?,?,?)");
            stm1 = c1.prepareStatement(sql_timesheet.toString());
            for (int i = 0 ; i < request.getTimesheet().size() ; i++){
                stm1.setString(1 , sheet.get(i).getStatus());
                stm1.setString(2 , sheet.get(i).getProject());
                stm1.setString(3 , sheet.get(i).getTask());
                stm1.setString(4 , sheet.get(i).getComp());
                stm1.setString(5 , sheet.get(i).getDate());
                stm1.setString(6 , sheet.get(i).getTime_in());
                stm1.setString(7 , sheet.get(i).getTime_out());
                stm1.setString(8 , sheet.get(i).getManday());
                stm1.setString(9 , sheet.get(i).getRemark());
                stm1.executeUpdate();
            }

            c2 = DriverManager.getConnection(Config.url , Config.user , Config.password);
            c2.setAutoCommit(false);
            
            ArrayList<TransPortation> trans = request.getTransportation();
            StringBuffer sql_transportation = new StringBuffer("INSERT INTO transportation (project , date , mrt_go , mrt_back , bts_go , bts_back , bus_go , bus_back , van_go , van_back , taxi_go , taxi_back , bike_go , bike_back , other) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stm2 = c2.prepareStatement(sql_transportation.toString());
            for (int i = 0 ; i < request.getTransportation().size() ; i++){
                stm2.setString(1 , trans.get(i).getProject());
                stm2.setString(2 , trans.get(i).getDate());
                stm2.setString(3 , trans.get(i).getMrt_go());
                stm2.setString(4 , trans.get(i).getMrt_back());
                stm2.setString(5 , trans.get(i).getBts_go());
                stm2.setString(6 , trans.get(i).getBts_back());
                stm2.setString(7 , trans.get(i).getBus_go());
                stm2.setString(8 , trans.get(i).getBus_back());
                stm2.setString(9 , trans.get(i).getVan_go());
                stm2.setString(10 , trans.get(i).getVan_back());
                stm2.setString(11 , trans.get(i).getTaxi_go());
                stm2.setString(12 , trans.get(i).getTaxi_back());
                stm2.setString(13 , trans.get(i).getBike_go());
                stm2.setString(14 , trans.get(i).getBike_back());
                stm2.setString(15 , trans.get(i).getOther());
                stm2.executeUpdate();
            }

            if (clack > 0){
                 flag = true;
                System.out.println("flag = true");
            }else {
                 flag = false;
                System.out.println("flag = false");
            }
        }
        catch (Exception error){
            System.err.println(error.getClass().getName() + ": " + error.getMessage());
//            error.printStackTrace();
        }
        finally {
            stm.close();
            c.commit();
            c.close();

            stm1.close();
            c1.commit();
            c1.close();

            stm2.close();
            c2.commit();
            c2.close();
        }
        return flag;
    }

//    @Override
//    public boolean addEmployee1(TimeSheet request) throws Exception {
//        Connection c = null;
//        PreparedStatement stm = null;
//        boolean flag = false;
//
//        try {
//            c = DriverManager.getConnection(Config.url , Config.user , Config.password);
//            c.setAutoCommit(false);
//
//            StringBuffer sql = new StringBuffer("INSERT INTO timesheet (status , project , task , comp , date , time_in , time_out , manday , remark) VALUES (? . ? . ? . ? . ? . ? . ? . ? . ? )");
//            stm = c.prepareStatement(sql.toString());
//            stm.setString(1 , request.getStatus());
//            stm.setString(2 , request.getProject());
//            stm.setString(3 , request.getTask());
//            stm.setString(4 , request.getComp());
//            stm.setString(5 , request.getDate());
//            stm.setString(6 , request.getTime_in());
//            stm.setString(7 , request.getTime_out());
//            stm.setString(8 , request.getManday());
//            stm.setString(9 , request.getRemark());
//
//            int clack = stm.executeUpdate();
//            if (clack > 0){
//                flag = true;
//                System.out.println("flag = true");
//            }else {
//                flag = false;
//                System.out.println("flag = false");
//            }
//        }
//        catch (Exception error){
//            System.err.println(error.getClass().getName() + ": " + error.getMessage());
////            error.printStackTrace();
//        }
//        finally {
//            stm.close();
//            c.commit();
//            c.close();
//        }
//
//        return flag;
//    }


    @Override
    public String updateEmployee(Product request) throws Exception {
        return null;
    }

    @Override
    public String deleteEmployee(String id) throws Exception {
        return null;
    }
}
