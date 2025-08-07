/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.service.custom.impl;

import sams.dao.DaoFactory;
import sams.dao.custom.ProgramDao;
import sams.dto.ProgramDetailsDto;
import sams.entity.ProgramEntity;
import sams.service.custom.ProgramService;
import sams.service.SuperService;
import java.util.ArrayList;



/**
 *
 * @author kithruV
 */
public class ProgramServiceImpl implements ProgramService{
    
    private ProgramDao programDao = (ProgramDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.PROGRAM);
    @Override
    public String saveProgram(ProgramDetailsDto programDetailsDto) throws Exception {
        ProgramEntity entity = new ProgramEntity( 
                programDetailsDto.getProgramName(),
                programDetailsDto.getProgramCode(),
                programDetailsDto.getDuration(),
                programDetailsDto.getDescription());
        
        return programDao.save(entity)? "Success" : "Fail";
        
    }

//    @Override
//    public String updateCustomer(ProgramDetailsDto programDetailsDto) throws Exception {
//        ProgramEntity entity = new ProgramEntity(
//                programDetailsDto.getProgramName(),
//                programDetailsDto.getProgramCode(),
//                programDetailsDto.getDuration(),
//                programDetailsDto.getDescription());
//        
//        return programDao.update(entity)? "Success" : "Fail";
//    }

//    @Override
//    public String deleteCustomer(String code) throws Exception {
//        return customerDao.delete(code) ? "Success": "Fail"; 
//    }

//    @Override
//    public CustomerDto searchCustomer(String code) throws Exception {
//        CustomerEntity entity = customerDao.search(code);
//        if(entity != null) {
//            return new CustomerDto(entity.getId(),
//                    entity.getTitle(), entity.getName(), entity.getDob(),
//                    entity.getSalary(), entity.getAddress(), entity.getCity(),
//                    entity.getProvice(), entity.getPostalCode());
//        } 
//        return null;
//    }

//    @Override
//    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
//       ArrayList<CustomerDto> customerDtos = new ArrayList<>();
//       
//       ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
//       customerEntities.forEach(entity-> {
//           customerDtos.add(new CustomerDto(entity.getId(),
//                    entity.getTitle(), entity.getName(), entity.getDob(),
//                    entity.getSalary(), entity.getAddress(), entity.getCity(),
//                    entity.getProvice(), entity.getPostalCode()));
//       });
//       
//       return customerDtos;
//    }
}


    