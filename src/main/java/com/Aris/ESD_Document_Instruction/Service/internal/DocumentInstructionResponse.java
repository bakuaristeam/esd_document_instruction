package com.Aris.ESD_Document_Instruction.Service.internal;

import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;

public class DocumentInstructionResponse {

    private int serverCode;
    private String serverMessage;
    private String statusMessage;
    private DocumentInstruction documentInstruction;

    public DocumentInstructionResponse(int serverCode, String serverMessage, String statusMessage, DocumentInstruction documentInstruction) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.statusMessage = statusMessage;
        this.documentInstruction = documentInstruction;
    }

    public DocumentInstructionResponse() {
    }

    public int getServerCode() {
        return serverCode;
    }

    public void setServerCode(int serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public DocumentInstruction getDocumentInstruction() {
        return documentInstruction;
    }

    public void setDocumentInstruction(DocumentInstruction documentInstruction) {
        this.documentInstruction = documentInstruction;
    }

    @Override
    public String toString() {
        return "DocumentInstructionResponse{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", documentInstruction=" + documentInstruction +
                '}';
    }
}
