package com.virtusa.procurement;

import com.virtusa.exception.TransactionAbortedException;
import com.virtusa.exception.UnprocessedMaterialException;

public class Requisition {

    public void createRequisition() throws TransactionAbortedException {

        Material material=new Material();

        try {
            material.getMaterial();
        } catch (UnprocessedMaterialException e) {
            throw new TransactionAbortedException("Requisition transaction aborted due to material processing being halted",e);
        }
    }
}
