package com.infinity.procurement;

import com.infinity.exception.TransactionAbortedException;
import com.infinity.exception.UnprocessedMaterialException;

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
