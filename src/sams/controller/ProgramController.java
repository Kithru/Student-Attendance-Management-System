/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.controller;

/**
 *
 * @author kithruV
 */
public class ProgramController {
    
    private ProgramService programService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.ITEM);
    
    public String saveItem(ItemDto itemDto) throws Exception{
        return itemService.saveItem(itemDto);
    }
}
