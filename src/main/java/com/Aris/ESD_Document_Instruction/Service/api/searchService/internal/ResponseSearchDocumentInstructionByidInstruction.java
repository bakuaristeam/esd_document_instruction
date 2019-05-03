package com.Aris.ESD_Document_Instruction.Service.api.searchService.internal;

import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;

import java.util.List;

public class ResponseSearchDocumentInstructionByidInstruction {

    private int serverCode;
    private String serverMessage;
    private List<DocumentInstruction> listOfDocumentInstructionByidInstruction;

    public ResponseSearchDocumentInstructionByidInstruction(int serverCode, String serverMessage, List<DocumentInstruction> listOfDocumentInstructionByidInstruction) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.listOfDocumentInstructionByidInstruction = listOfDocumentInstructionByidInstruction;
    }

    public ResponseSearchDocumentInstructionByidInstruction() {
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

    public List<DocumentInstruction> getListOfDocumentInstructionByidInstruction() {
        return listOfDocumentInstructionByidInstruction;
    }

    public void setListOfDocumentInstructionByidInstruction(List<DocumentInstruction> listOfDocumentInstructionByidInstruction) {
        this.listOfDocumentInstructionByidInstruction = listOfDocumentInstructionByidInstruction;
    }

    @Override
    public String toString() {
        return "ResponseSearchDocumentInstructionByidInstruction{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", listOfDocumentInstructionByidInstruction=" + listOfDocumentInstructionByidInstruction +
                '}';
    }
}
