package com.Aris.ESD_Document_Instruction.db.repo;

import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface RepoDocumentInstruction extends CrudRepository<DocumentInstruction,Long> {

    DocumentInstruction findByIdDocumentInstructionAndIsDelete(long idDocIns,int isDelete);

    DocumentInstruction findByIdDocumentInstructionAndIsActive(long idDocIns,int isActive);


    List<DocumentInstruction> findByIdInstructionAndIsActive(long idIns,int isActive);

    DocumentInstruction findByIdDocumentAndInstructionForEmpIdAndIsActive(long idDoc,long insForEmpId,int isActive);

//
}
