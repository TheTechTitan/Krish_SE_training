package com.virtusa.procurement;

import com.virtusa.exception.CreditException;

public class Payment {

    public void submitPurchaseRequisition() throws CreditException {

        throw new CreditException("Insufficient credit balance in given account");
    }
}
