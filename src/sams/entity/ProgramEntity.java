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
    private String programId;
    private String programName;
    private String programCode;
    private String duration;
    private String description;

    public ProgramEntity() {
    }

    public ProgramEntity(String programName, String programCode, String duration, String description) {
        this.programName = programName;
        this.programCode = programCode;
        this.duration = duration;
        this.description = description;
    }

    // Constructor for existing records
    public ProgramEntity(String programId, String programName, String programCode, String duration, String description) {
        this.programId = programId;
        this.programName = programName;
        this.programCode = programCode;
        this.duration = duration;
        this.description = description;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
        @Override
        public String toString() {
            return "ProgramEntity{" +
                   "programName='" + programName + '\'' +
                   ", programCode='" + programCode + '\'' +
                   ", duration='" + duration + '\'' +
                   ", description='" + description + '\'' +
                   '}';
        }

    public Object getProgramId() {
        return programId;
    }
}
