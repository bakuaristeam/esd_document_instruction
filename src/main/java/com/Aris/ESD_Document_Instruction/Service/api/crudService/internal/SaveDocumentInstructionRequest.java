package com.Aris.ESD_Document_Instruction.Service.api.crudService.internal;

import java.util.Date;

public class SaveDocumentInstructionRequest {

    private long idDocumentInstruction;
    private long idInstruction;
    private long idDocumentMov;
    private long enteredEmployeeID;
    private long enteredDate;
    private int taskDate;
    private long instructionForEmpId;
    private int isActive;
    private int isDelete;

    public SaveDocumentInstructionRequest(long idDocumentInstruction, long idInstruction, long idDocumentMov, long enteredEmployeeID, long enteredDate, int taskDate, long instructionForEmpId, int isActive, int isDelete) {
        this.idDocumentInstruction = idDocumentInstruction;
        this.idInstruction = idInstruction;
        this.idDocumentMov = idDocumentMov;
        this.enteredEmployeeID = enteredEmployeeID;
        this.enteredDate = enteredDate;
        this.taskDate = taskDate;
        this.instructionForEmpId = instructionForEmpId;
        this.isActive = isActive;
        this.isDelete = isDelete;
    }

    public SaveDocumentInstructionRequest() {
    }

    @Override
    public String toString() {
        return "SaveDocumentInstructionRequest{" +
                "idDocumentInstruction=" + idDocumentInstruction +
                ", idInstruction=" + idInstruction +
                ", idDocumentMov=" + idDocumentMov +
                ", enteredEmployeeID=" + enteredEmployeeID +
                ", enteredDate=" + enteredDate +
                ", taskDate=" + taskDate +
                ", instructionForEmpId=" + instructionForEmpId +
                ", isActive=" + isActive +
                ", isDelete=" + isDelete +
                '}';
    }

    public long getIdDocumentInstruction() {
        return idDocumentInstruction;
    }

    public void setIdDocumentInstruction(long idDocumentInstruction) {
        this.idDocumentInstruction = idDocumentInstruction;
    }

    public long getIdInstruction() {
        return idInstruction;
    }

    public void setIdInstruction(long idInstruction) {
        this.idInstruction = idInstruction;
    }

    public long getIdDocumentMov() {
        return idDocumentMov;
    }

    public void setIdDocumentMov(long idDocumentMov) {
        this.idDocumentMov = idDocumentMov;
    }

    public long getEnteredEmployeeID() {
        return enteredEmployeeID;
    }

    public void setEnteredEmployeeID(long enteredEmployeeID) {
        this.enteredEmployeeID = enteredEmployeeID;
    }

    public long getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(long enteredDate) {
        this.enteredDate = enteredDate;
    }

    public int getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(int taskDate) {
        this.taskDate = taskDate;
    }

    public long getInstructionForEmpId() {
        return instructionForEmpId;
    }

    public void setInstructionForEmpId(long instructionForEmpId) {
        this.instructionForEmpId = instructionForEmpId;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
