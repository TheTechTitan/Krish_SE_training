package lk.titanium.shoppingcloud.orderprocesstask.service;

import org.springframework.stereotype.Service;

@Service
public class OrderProcessServiceImpl implements OrderProcessService {

    @Override
    public boolean validateZipCode(String zipCode) {
        return zipCode.length() == 4;
    }
}
