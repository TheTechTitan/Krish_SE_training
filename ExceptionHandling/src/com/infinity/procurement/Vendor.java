package com.infinity.procurement;

import com.infinity.exception.CreditException;
import com.infinity.exception.NoInvoiceException;

public class Vendor {

    public void addVendor() throws NoInvoiceException {

        Payment payment=new Payment();

        try {
            payment.submitPurchaseRequisition();
        } catch (CreditException e) {
            throw new NoInvoiceException("Invoice not processed due to insufficient credit balance",e);
        }
    }

}
