package com.Aris.ESD_Document_Instruction.Service.internalServices;

import com.Aris.ESD_Document_Instruction.Service.api.searchService.internal.ResponseListDocIns;
import com.Aris.ESD_Document_Instruction.Service.api.searchService.internal.ResponseSearchDocumentInstructionByidDocument;
import com.Aris.ESD_Document_Instruction.Service.api.searchService.internal.ResponseSearchDocInsByIdDocIns;
import com.Aris.ESD_Document_Instruction.Service.api.searchService.internal.ResponseSearchDocumentInstructionByidInstruction;
import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;
import com.Aris.ESD_Document_Instruction.db.repo.RepoDocumentInstruction;
import com.Aris.ESD_Document_Instruction.utill.HazelCastUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocumentInstructionSearchInternalService {

    @Autowired
    RepoDocumentInstruction repoDocumentInstruction;

    @Autowired
    HazelCastUtility hazelCastUtility;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ResponseSearchDocumentInstructionByidDocument getDocInsByidDocumentMov(long idDocMov) {
        DocumentInstruction documentInstruction = repoDocumentInstruction.findByIdDocumentMovAndIsActive(idDocMov,1);
        ResponseSearchDocumentInstructionByidDocument response = new ResponseSearchDocumentInstructionByidDocument();
        try {
            if (documentInstruction != null) {
                response.setDocIns(documentInstruction);
                response.setServerCode(200);
                response.setServerMessage(" DocumentInstruction found");
                logger.info("SearchDocument response : {}", response.toString());
            } else {
                response.setDocIns(null);
                response.setServerCode(220);
                response.setServerMessage("DocumentInstruction not Found");
            }
        } catch (Exception e) {
            response.setServerCode(100);
            response.setServerMessage("error" + e);
            logger.info("error", e);
        }
        return response;
    }

//

    public ResponseSearchDocInsByIdDocIns getDocInsByIdDocIns(long idDocIns) {
//        DocumentInstruction documentInstruction = repoDocumentInstruction.findByIdDocumentInstructionAndIsActive(idDocIns, 1);

        DocumentInstruction documentInstruction=null;
        ResponseSearchDocInsByIdDocIns response = new ResponseSearchDocInsByIdDocIns();
        try {
            documentInstruction=hazelCastUtility.getDocInst(idDocIns);
            if (documentInstruction == null) {
                response.setDocIns(null);
                response.setServerCode(220);
                response.setServerMessage("DocumentInstruction not found");
                logger.info("SearchDocumentInstruction response : {}", response.toString());
            } else {
                response.setDocIns(documentInstruction);
                response.setServerCode(200);
                response.setServerMessage(" DocumentInstruction found");
                logger.info("SearchDocumentInstruction response : {}", response.toString());
            }
        } catch (Exception e) {
            response.setServerCode(100);
            response.setServerMessage("error" + e);
            logger.info("error", e);

        }
        return response;
    }


    public ResponseSearchDocumentInstructionByidInstruction getDocInsByIdIns(long idIns) {
        List<DocumentInstruction> listOfidInstruction = repoDocumentInstruction.findByIdInstructionAndIsActive(idIns, 1);

        ResponseSearchDocumentInstructionByidInstruction response = new ResponseSearchDocumentInstructionByidInstruction();
        try {
            if (listOfidInstruction != null && listOfidInstruction.size() > 0) {
                response.setListOfDocumentInstructionByidInstruction(listOfidInstruction);
                response.setServerCode(200);
                response.setServerMessage(" Documentİnstruction found");
                logger.info("SearchDocumentİnstruction response : {}", response.toString());
            } else {
                response.setListOfDocumentInstructionByidInstruction(null);
                response.setServerCode(220);
                response.setServerMessage("documentInstruction searchInternal");
            }
        } catch (Exception e) {
            response.setServerCode(100);
            response.setServerMessage("error" + e);
            logger.info("error", e);
        }
        return response;
    }

    public ResponseListDocIns getDocInsByIdDocMove(long idDocMov) {
        List<DocumentInstruction> listOfidInstruction = repoDocumentInstruction.findByIsActiveAndIdDocumentMov(1,idDocMov);
        logger.info("listofIdInstruction : {}",listOfidInstruction);

        ResponseListDocIns response = new ResponseListDocIns();
        try {
            if (listOfidInstruction != null && listOfidInstruction.size() > 0) {
                response.setListDocIns(listOfidInstruction);
                response.setServerCode(200);
                response.setServerMessage(" Documentİnstruction found");
                logger.info("SearchDocumentİnstruction response : {}", response.toString());
            } else {
                response.setListDocIns(null);
                response.setServerCode(220);
                response.setServerMessage("documentInstruction searchInternal");
            }
        } catch (Exception e) {
            response.setServerCode(100);
            response.setServerMessage("error" + e);
            logger.info("error", e);
        }
        return response;
    }


}
