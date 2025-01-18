package com.cars24.runner;

import com.cars24.dao.impl.CustomerDaoImpl;
import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.res.CustomerProfileRes;
import com.cars24.services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class UI {

    private static Scanner scanner  = new Scanner(System.in);
    public static void addCustomer()
    {
        System.out.println("Enter customer details");
        AddCustomerReq req = new AddCustomerReq();

        req.setName(scanner.next());
        req.setEmail(scanner.next());
        req.setPhone(scanner.next());
        req.setAddress(scanner.next());

        CustomerServiceImpl cust1=new CustomerServiceImpl();
        cust1.registerCustomer(req);
    }

    public static void getCustomer()
    {
        System.out.println("Search customer details");
        CustomerProfileReq req = new CustomerProfileReq();

        System.out.println("Enter Email  : ");
        req.setEmail(scanner.next());
        System.out.println("Enter Phone  : ");
        req.setPhone(scanner.next());

        CustomerDaoImpl cust=new CustomerDaoImpl();
        cust.getCustomer(req);
        CustomerProfileRes response = cust.getCustomer(req);


    }

    public static void updateCustomer(){
        AddCustomerReq cust_req=new AddCustomerReq();
        System.out.println("enter");
        cust_req.setName(scanner.next());
        cust_req.setPhone(scanner.next());
        cust_req.setEmail(scanner.next());
        cust_req.setAddress(scanner.next());
        CustomerServiceImpl cust1=new CustomerServiceImpl();
        cust1.updateCustomer(cust_req);

    }

    public static void deleteCustomer(){

        AddCustomerReq cust_req=new AddCustomerReq();
        System.out.println("enter");
        cust_req.setPhone(scanner.next());
        cust_req.setEmail(scanner.next());
        CustomerServiceImpl cust1=new CustomerServiceImpl();
        cust1.deleteCustomer(cust_req);
    }

}
