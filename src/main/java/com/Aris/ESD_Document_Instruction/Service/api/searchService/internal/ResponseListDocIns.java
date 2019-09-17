package com.Aris.ESD_Document_Instruction.Service.api.searchService.internal;

import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;

import java.util.List;

public class ResponseListDocIns {

    private int serverCode;
    private String serverMessage;
    private List<DocumentInstruction> listDocIns;

    public ResponseListDocIns(int serverCode, String serverMessage, List<DocumentInstruction> listDocIns) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.listDocIns = listDocIns;
    }

    public ResponseListDocIns() {
    }

    @Override
    public String toString() {
        return "ResponseListDocIns{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", listDocIns=" + listDocIns +
                '}';
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

    public List<DocumentInstruction> getListDocIns() {
        return listDocIns;
    }

    public void setListDocIns(List<DocumentInstruction> listDocIns) {
        this.listDocIns = listDocIns;
    }
}
