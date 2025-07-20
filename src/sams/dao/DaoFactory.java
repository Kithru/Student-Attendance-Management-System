/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.dao;

import sams.dao.custom.impl.ProgramDaoImpl;
//import edu.ijse.layerd.dao.custom.impl.ItemDaoImpl;
//import edu.ijse.layerd.dao.custom.impl.OrderDaoImpl;
//import edu.ijse.layerd.dao.custom.impl.OrderDetailImpl;
/**
 *
 * @author kithruV
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailImpl();
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        ITEM, CUSTOMER, ORDER, ORDER_DETAIL
    }
}
