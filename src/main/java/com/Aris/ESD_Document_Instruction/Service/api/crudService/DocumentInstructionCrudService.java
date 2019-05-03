package com.Aris.ESD_Document_Instruction.Service.api.crudService;

import com.Aris.ESD_Document_Instruction.Service.internal.DocumentInstructionResponse;
import com.Aris.ESD_Document_Instruction.Service.api.crudService.internal.SaveDocumentInstructionRequest;
import com.Aris.ESD_Document_Instruction.Service.api.crudService.internal.UpdateDocumentInstructionRequest;
import com.Aris.ESD_Document_Instruction.Service.internalServices.DocumentInstructionCrudInternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crudServices")
public class
DocumentInstructionCrudService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    DocumentInstructionCrudInternalService documentInstructionCrudInternalService;

    @PostMapping("/add")
    public DocumentInstructionResponse saveDocIns(@RequestBody SaveDocumentInstructionRequest saveDocumentRequest) {

        logger.info("esd_doc-ins->add->request : {}"+saveDocumentRequest.toString());

        return documentInstructionCrudInternalService.saveDocumentInstructionResponse(saveDocumentRequest);

    }

    @PostMapping("/update")
    public DocumentInstructionResponse updateDocIns(@RequestBody UpdateDocumentInstructionRequest updateDocumentInstructionRequest) {
        logger.info("esd_doc-ins->update->request : {}"+updateDocumentInstructionRequest.toString());

        return documentInstructionCrudInternalService.updateDocument(updateDocumentInstructionRequest);

    }


    @GetMapping("/delete/{idDocIns}")
    public DocumentInstructionResponse deleteDocIns(@PathVariable("idDocIns")long idDocumentInstruction) {
        return documentInstructionCrudInternalService.deleteDocumentInstruction(idDocumentInstruction);
    }

}
