package com.Aris.ESD_Document_Instruction.Service.api.searchService;

import com.Aris.ESD_Document_Instruction.Service.api.searchService.internal.ResponseSearchDocumentInstructionByidDocument;
import com.Aris.ESD_Document_Instruction.Service.api.searchService.internal.ResponseSearchDocInsByIdDocIns;
import com.Aris.ESD_Document_Instruction.Service.api.searchService.internal.ResponseSearchDocumentInstructionByidInstruction;
import com.Aris.ESD_Document_Instruction.Service.internalServices.DocumentInstructionSearchInternalService;
import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;
import com.Aris.ESD_Document_Instruction.db.repo.RepoDocumentInstruction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/searchServices")
public class DocumentInstructionSearchServices {


    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    DocumentInstructionSearchInternalService documentInstructionSearchInternalService;

    @Autowired
    RepoDocumentInstruction repoDocumentInstruction;

    @GetMapping("/getDocInsByIdDocIns/{idDocIns}")
    public ResponseSearchDocInsByIdDocIns getDocByIdIns(@PathVariable("idDocIns") long idDocIns){
        logger.info("esd_DocumentInstruction_idDocumentInstruction->search->request : {}",idDocIns);
        return documentInstructionSearchInternalService.getDocInsByIdDocIns(idDocIns);
    }

    @GetMapping("/getDocInsByIdDoc/{idDoc}/{idEmp}")
    public ResponseSearchDocumentInstructionByidDocument getDocInsByIdDoc(@PathVariable("idDoc") long idDoc,
                                                                   @PathVariable("idEmp")long idEmp){
        logger.info("esd_DocumentInstruction_idDocument->search->request : {}",idDoc);
        return documentInstructionSearchInternalService.getDocInsByidDocument(idDoc,idEmp);
    }

    @GetMapping("/getDocInsByIdIns/{idIns}")
    public ResponseSearchDocumentInstructionByidInstruction getDocByIdDIns(@PathVariable("idIns") long idIns){
        logger.info("esd_DocumentInstruction_idDocument->search->request : {}",idIns);
        return documentInstructionSearchInternalService.getDocInsByIdIns(idIns);
    }


    @GetMapping("/documentInstruction/all")
    public List<DocumentInstruction> getStudents(){
        Iterator<DocumentInstruction> iterator= repoDocumentInstruction.findAll().iterator();
        List<DocumentInstruction> students=new ArrayList<>();
        while(iterator.hasNext()){
            students.add(iterator.next());
        }
        return students;
    }


}
