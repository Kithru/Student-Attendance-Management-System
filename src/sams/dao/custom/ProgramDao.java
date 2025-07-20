/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sams.dao.custom;

import java.util.ArrayList;
import sams.dao.SuperDao;

/**
 *
 * @author kithruV
 */
public interface ProgramDao <T, ID> extends SuperDao{
    public boolean save(T t) throws Exception;
//    public boolean update(T t) throws Exception;
//    public boolean delete(ID id) throws Exception;
//    public T search(ID id) throws Exception;
//    public ArrayList<T> getAll() throws Exception;
    
}
