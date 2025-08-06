/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.dao.custom.impl;

import sams.dao.CrudUtil;
import sams.dao.custom.ProgramDao;
import sams.entity.ProgramEntity;
import java.util.ArrayList;

import java.sql.ResultSet;
/**
 *
 * @author kithruV
 * 
 */
public class ProgramDaoImpl implements ProgramDao{  
    @Override
    public boolean save(ProgramEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO Program (programName, programCode, duration, description) VALUES (?, ?, ?, ?)",
            t.getProgramName(), t.getProgramCode(), t.getDuration(), t.getDescription()
        );
    }

//    @Override
//    public boolean update(ProgramEntity t) throws Exception {
//        return CrudUtil.executeUpdate("UPDATE Program SET programName = ?, programCode = ?, duration = ?, description= ? WHERE ProgramID = ?",
//
//                t.getProgramName(), t.getProgramCode(), t.getDuration(), t.getDescription(), t.getCode());
//    }

//    @Override
//    public boolean delete(String id) throws Exception {
//        return  CrudUtil.executeUpdate("DELETE FROM Item WHERE ItemCode = ?", id);
//    }

//    @Override
//    public ItemEntity search(String id) throws Exception {
//        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item WHERE ItemCode = ?", id);
//        
//        if(rst.next()){
//            return new ItemEntity(
//                    rst.getString("ItemCode"),
//                    rst.getString("Description"),
//                    rst.getString("PackSize"),
//                    rst.getDouble("UnitPrice"),
//                    rst.getInt("QtyOnHand"));
//        }
//        return null;
//    }

//    @Override
//    public ArrayList<ItemEntity> getAll() throws Exception {
//        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item");
//        ArrayList<ItemEntity> itemEntities = new ArrayList<>();
//        
//        while (rst.next()) {            
//            itemEntities.add(new ItemEntity(
//                    rst.getString("ItemCode"),
//                    rst.getString("Description"),
//                    rst.getString("PackSize"),
//                    rst.getDouble("UnitPrice"),
//                    rst.getInt("QtyOnHand")));
//        }
//        return itemEntities;
//    }
}
