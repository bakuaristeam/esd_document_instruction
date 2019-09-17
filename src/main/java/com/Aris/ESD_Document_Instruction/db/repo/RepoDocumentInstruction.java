package com.Aris.ESD_Document_Instruction.db.repo;

import com.Aris.ESD_Document_Instruction.db.entities.DocumentInstruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RepoDocumentInstruction extends JpaRepository<DocumentInstruction,Long> {

    //    DocumentInstruction findByIdDocumentAndInstructionForEmpIdAndIsActive(long idDoc,long insForEmpId,int isActive);
//    DocumentInstruction findByIdDocumentInstructionAndIsDelete(long idDocIns,int isDelete);


    List<DocumentInstruction> findByIdInstructionAndIsActive(long idIns,int isActive);
    DocumentInstruction findByIdDocumentInstructionAndIsActive(long idDocIns,int isActive);
    DocumentInstruction findByIdDocumentMovAndIsActive(long idDocMov,int isActive);

    List<DocumentInstruction> findByIsActiveAndIdDocumentMov(int isActivee, long idDocmove);

}
