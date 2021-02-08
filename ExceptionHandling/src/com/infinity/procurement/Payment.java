package com.infinity.procurement;

import com.infinity.exception.CreditException;

public class Payment {

    public void submitPurchaseRequisition() throws CreditException {

        throw new CreditException("Insufficient credit balance in given account");
    }
}
