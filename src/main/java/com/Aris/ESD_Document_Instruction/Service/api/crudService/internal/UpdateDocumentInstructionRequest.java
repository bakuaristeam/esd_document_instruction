package com.Aris.ESD_Document_Instruction.Service.api.crudService.internal;

import java.util.Date;

public class UpdateDocumentInstructionRequest {

    private long idDocumentInstruction;
    private long idInstruction;
    private long idDocument;
    private long enteredEmployeeID;
    private long enteredDate;
    private int taskDate;
    private long instructionForEmpId;
    private int isActive;
    private int isDelete;

    public UpdateDocumentInstructionRequest(long idDocumentInstruction, long idInstruction, long idDocument, long enteredEmployeeID, long enteredDate, int taskDate, long instructionForEmpId, int isActive, int isDelete) {
        this.idDocumentInstruction = idDocumentInstruction;
        this.idInstruction = idInstruction;
        this.idDocument = idDocument;
        this.enteredEmployeeID = enteredEmployeeID;
        this.enteredDate = enteredDate;
        this.taskDate = taskDate;
        this.instructionForEmpId = instructionForEmpId;
        this.isActive = isActive;
        this.isDelete = isDelete;
    }

    public UpdateDocumentInstructionRequest() {
    }

    @Override
    public String toString() {
        return "UpdateDocumentInstructionRequest{" +
                "idDocumentInstruction=" + idDocumentInstruction +
                ", idInstruction=" + idInstruction +
                ", idDocument=" + idDocument +
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

    public long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(long idDocument) {
        this.idDocument = idDocument;
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
