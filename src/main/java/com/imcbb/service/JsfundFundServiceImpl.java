package com.imcbb.service;

import org.springframework.stereotype.Service;

@Service("jsfundService")
public class JsfundFundServiceImpl implements FundService{
    private static final String MERCHANT_ID = "006";
    @Override
    public String getServiceID() {
        return MERCHANT_ID;
    }

    @Override
    public boolean openAccount() {

        System.out.println("jsfund account opened!");
        return false;
    }
}
