package com.Aris.ESD_Document_Instruction.Service.internalServices;

import com.Aris.ESD_Document_Instruction.Service.internal.*;
import com.Aris.ESD_Document_Instruction.Service.api.crudService.internal.SaveDocumentInstructionRequest;
import com.Aris.ESD_Document_Instruction.Service.api.crudService.internal.UpdateDocumentInstructionRequest;
import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;
import com.Aris.ESD_Document_Instruction.db.repo.RepoDocumentInstruction;
import com.Aris.ESD_Document_Instruction.utill.HazelCastUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocumentInstructionCrudInternalService {

    @Autowired
    RepoDocumentInstruction repoDocumentInstruction;

    @Autowired
    HazelCastUtility hazelCastUtility;


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public DocumentInstructionResponse saveDocumentInstructionResponse(SaveDocumentInstructionRequest saveDocumentInstructionRequest) {
        DocumentInstructionResponse documentResponse = new DocumentInstructionResponse();
        try {
            DocumentInstruction documentInstruction = new DocumentInstruction();
            documentResponse.setServerCode(200);
            documentResponse.setServerMessage("OK");
            documentResponse.setStatusMessage("Saved");
            logger.info("saveDocumentInstruction response : {}", saveDocumentInstructionRequest.toString());

            documentInstruction.setIdInstruction(saveDocumentInstructionRequest.getIdInstruction());
            documentInstruction.setIdDocumentMov(saveDocumentInstructionRequest.getIdDocumentMov());
            documentInstruction.setEnteredEmployeeID(saveDocumentInstructionRequest.getEnteredEmployeeID());
            documentInstruction.setEnteredDate(saveDocumentInstructionRequest.getEnteredDate());
            documentInstruction.setTaskDate(saveDocumentInstructionRequest.getTaskDate());
            documentInstruction.setInstructionForEmpId(saveDocumentInstructionRequest.getInstructionForEmpId());
            documentInstruction.setIsActive(1);
            documentInstruction.setIsDelete(0);

            documentInstruction.setInstruction(saveDocumentInstructionRequest.getInstruction());
//            documentInstruction=repoDocumentInstruction.save(documentInstruction);

            documentInstruction=hazelCastUtility.save(documentInstruction);
            documentResponse.setDocumentInstruction(documentInstruction);
        } catch (Exception e) {
            documentResponse.setServerCode(100);
            documentResponse.setServerMessage("error");
            documentResponse.setStatusMessage("No Saved");
            logger.error("Error save file text : {}", e);
        }
        return documentResponse;
    }

    public DocumentInstructionResponse updateDocument(UpdateDocumentInstructionRequest updateDocumentInstructionRequest) {
        DocumentInstructionResponse documentInstructionResponse= new DocumentInstructionResponse();
        DocumentInstruction documentInstruction = repoDocumentInstruction.findByIdDocumentInstructionAndIsActive(updateDocumentInstructionRequest.getIdDocumentInstruction(),1);
        try {
            if(documentInstruction!=null){

            documentInstructionResponse.setServerCode(200);
            documentInstructionResponse.setServerMessage("OK");
            documentInstructionResponse.setStatusMessage("Update");

            logger.info("updateDocumentInstruction response : {}", documentInstructionResponse.toString());


            documentInstruction.setIdDocumentMov(updateDocumentInstructionRequest.getIdDocumentInstruction());
            documentInstruction.setIdInstruction(updateDocumentInstructionRequest.getIdInstruction());
            documentInstruction.setEnteredDate(updateDocumentInstructionRequest.getEnteredDate());
            documentInstruction.setEnteredEmployeeID(updateDocumentInstructionRequest.getEnteredEmployeeID());
            documentInstruction.setTaskDate(updateDocumentInstructionRequest.getTaskDate());
            documentInstruction.setInstructionForEmpId(updateDocumentInstructionRequest.getInstructionForEmpId());
            documentInstruction.setIsDelete(updateDocumentInstructionRequest.getIsDelete());
            documentInstruction.setIsActive(updateDocumentInstructionRequest.getIsActive());
            documentInstruction.setInstruction(updateDocumentInstructionRequest.getInstruction());

//            documentInstruction=repoDocumentInstruction.save(documentInstruction);
            documentInstruction=hazelCastUtility.save(documentInstruction);
            documentInstructionResponse.setDocumentInstruction(documentInstruction);
            }else{
                documentInstructionResponse.setServerCode(220);
                documentInstructionResponse.setServerMessage("OK");
                documentInstructionResponse.setStatusMessage("file not found");
                logger.info("updateDocumentInstruction response : {}", documentInstructionResponse.toString());
            }
        } catch (Exception e) {
            documentInstructionResponse.setServerCode(100);
            documentInstructionResponse.setServerMessage("error");
            documentInstructionResponse.setStatusMessage("No Update");
            logger.error("Error save file text : {}", e);
        }
        return documentInstructionResponse;
    }


    public DocumentInstructionResponse deleteDocumentInstruction(long idDocumentInsrtuction) {
        logger.info("step1---");
        DocumentInstructionResponse documentInstructionResponse= new DocumentInstructionResponse();
        logger.info("step2---");
        try {
            DocumentInstruction documentInstruction= repoDocumentInstruction.findByIdDocumentInstructionAndIsActive(idDocumentInsrtuction,0);
            logger.info("step3---");
            if(documentInstruction!=null) {
                logger.info("step4---");
                documentInstructionResponse.setServerMessage("OK");
                logger.info("deleteDocumentInstruction response : {}", documentInstructionResponse.toString());

                documentInstruction.setIsDelete(1);
                documentInstruction = repoDocumentInstruction.save(documentInstruction);
                documentInstructionResponse.setDocumentInstruction(documentInstruction);

//            hazelCastUtility.deleteDocInst(idDocumentInsrtuction);
                documentInstructionResponse.setStatusMessage("Deleted");
                documentInstructionResponse.setServerCode(200);
            }
        } catch (Exception e) {
            documentInstructionResponse.setServerCode(100);
            documentInstructionResponse.setServerMessage("error");
            documentInstructionResponse.setStatusMessage("No Delete");
            logger.error("Error delete file text : {}", e);
        }
        return documentInstructionResponse;
    }



}
