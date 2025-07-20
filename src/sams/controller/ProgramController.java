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
    
    public String saveItem(ProgramDetailsDto programDetailsDto) throws Exception{
        return programService.saveItem(programDetailsDto);
    }
}
