/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.entity;

/**
 *
 * @author kithruV
 */
public class ProgramEntity {
    private String description;
    private String duration;
    private String programCode;
    private String programName;

    public ProgramEntity() {
    }

    public ProgramEntity(String description, String duration, String programCode, String programName) {
        this.description = description;
        this.duration = duration;
        this.programCode = programCode;
        this.programName = programName;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
    
    
    
}
