/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sams.dto;

/**
 *
 * @author kithruV
 */
public class ProgramDetailsDto {
    private String programId;
    private String programName;
    private String programCode;
    private String duration;
    private String description;



    public ProgramDetailsDto(String programId, String programName, String programCode, String duration, String description) {
        this.programId = programId;
        this.programName = programName;
        this.programCode = programCode;
        this.duration = duration;
        this.description = description;
    }


    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
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


    @Override
    public String toString() {
        return "ProgramDetailsDto{" +
                "programId='" + programId + '\'' +
               "programName='" + programName + '\'' +
               ", programCode='" + programCode + '\'' +
               ", duration='" + duration + '\'' +
               ", description='" + description + '\'' +
               '}' ;
    }
}
