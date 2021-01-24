package com.virtusa.procurement;

import com.virtusa.exception.CreditException;
import com.virtusa.exception.NoInvoiceException;

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
