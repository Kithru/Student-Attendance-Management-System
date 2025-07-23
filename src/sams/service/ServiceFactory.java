/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.service;

import sams.service.custom.impl.ProgramServiceImpl;
//import edu.ijse.layerd.service.custom.impl.ItemServiceImpl;
//import edu.ijse.layerd.service.custom.impl.OrderServiceImpl;
/**
 *
 * @author kithruV
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceTypes type){
        switch (type) {
            case PROGRAM:
                return new ProgramServiceImpl();
//            case CUSTOMER:
//                return new CustomerServiceImpl();
//            case ORDER:
//                return new OrderServiceImpl();
            default:
                throw new AssertionError();
        }
    }
    
    public enum ServiceTypes{
//        CUSTOMER, ITEM, ORDER
        PROGRAM
    }

    
}
