/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sams.service.custom;

import java.util.ArrayList;
import sams.dto.ProgramDetailsDto;
import sams.service.SuperService;


/**
 *
 * @author kithruV
 */
public interface ProgramService extends SuperService{
    public String saveProgram(ProgramDetailsDto programDetailsDto) throws Exception;
//    public String updateItem(ProgramDetailsDto programDetailsDto) throws Exception;

    <ProgramDetailsDto> ArrayList<sams.dto.ProgramDetailsDto> getAllProgram() throws Exception;


//    public String deleteItem(String id) throws Exception;
    public ProgramDetailsDto searchProgram(String id) throws Exception;
//    public ArrayList<ItemDto> getALlItem() throws Exception;
}
