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

    @Override
    public ProgramDetailsDto searchProgram(String Id) throws Exception {
        ProgramEntity entity = ProgramDao.searchProgram(Id);
        if(entity != null) {
            return new ProgramDetailsDto((String) entity.getProgramId(),
                    entity.getProgramName(), entity.getProgramCode(),
                    entity.getDuration(),entity.getDescription());
        }
        return null;
    }

    @Override
    public ArrayList<ProgramDetailsDto> getAllProgram() throws Exception {
        ArrayList<ProgramDetailsDto> programDetailsDtos = new ArrayList<>();

        ArrayList<ProgramEntity> programEntities = programDao.getAllProgram();
        programEntities.forEach(entity -> {
            programDetailsDtos.add(new ProgramDetailsDto(
                entity.getProgramName(),
                entity.getProgramCode(),
                entity.getDuration(),
                entity.getDescription()
            ));
        });

        return programDetailsDtos;
    }
}


    