package com.virtusa.procurement;

import com.virtusa.exception.NoInvoiceException;
import com.virtusa.exception.UnprocessedMaterialException;

public class Material {

    public void getMaterial() throws UnprocessedMaterialException {

        Vendor vendor=new Vendor();

        try {
            vendor.addVendor();
        } catch (NoInvoiceException e) {
            throw new UnprocessedMaterialException("Material billing halted due to Invoice error",e);
        }
    }


}
