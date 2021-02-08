package com.infinity.procurement;

import com.infinity.exception.NoInvoiceException;
import com.infinity.exception.UnprocessedMaterialException;

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
