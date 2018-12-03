package com.imcbb.service;

import com.imcbb.bean.FundMerchant;
import org.springframework.stereotype.Service;

@Service("jsfundService")
public class JsfundFundServiceImpl implements FundService{
    @Override
    public String getServiceID() {
        return FundMerchant.MERCHANT_ID_JSFUND;
    }

    @Override
    public boolean openAccount() {

        System.out.println("jsfund account opened!");
        return false;
    }
}
