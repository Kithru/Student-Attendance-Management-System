/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.controller;

import sams.dto.ProgramDetailsDto;
import sams.service.ServiceFactory;
import sams.service.custom.ProgramService;
import java.util.ArrayList;
/**
 *
 * @author kithruV
 */
public class ProgramController {
    
    private ProgramService programService = (ProgramService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.PROGRAM);
    
    public String saveProgram(ProgramDetailsDto programDetailsDto) throws Exception{
        return programService.saveProgram(programDetailsDto);
    }
    
//    public String updateItem(ProgramDetailsDto programDetailsDto) throws Exception{
//        return programService.updateItem(programDetailsDto);
//    }
//    
//    public String deleteItem(String code) throws Exception{
//        return programService.deleteItem(code);
//    }
//    
    public ProgramDetailsDto searchProgram(String code) throws Exception{
        return programService.searchProgram(code);
    }
//    
    public ArrayList<ProgramDetailsDto> getAllProgram() throws Exception{
        return programService.getAllProgram();
    }
}
