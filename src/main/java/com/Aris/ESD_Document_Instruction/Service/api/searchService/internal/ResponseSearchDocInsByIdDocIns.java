package com.Aris.ESD_Document_Instruction.Service.api.searchService.internal;

import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;

import java.util.List;

public class ResponseSearchDocInsByIdDocIns {
    private int serverCode;
    private String serverMessage;
    private DocumentInstruction docIns;

    public ResponseSearchDocInsByIdDocIns(int serverCode, String serverMessage, DocumentInstruction docIns) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.docIns = docIns;
    }

    public ResponseSearchDocInsByIdDocIns() {
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

    public DocumentInstruction getDocIns() {
        return docIns;
    }

    public void setDocIns(DocumentInstruction docIns) {
        this.docIns = docIns;
    }

    @Override
    public String toString() {
        return "ResponseSearchDocInsByIdDocIns{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", docIns=" + docIns +
                '}';
    }
}
