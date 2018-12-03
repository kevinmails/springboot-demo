package com.imcbb.service;

import org.springframework.stereotype.Service;

/**
 * @author kevin
 */
@Service("huaxiaFund")
public class HuaxiaFundServiceImpl implements FundService {
    private static final String MERCHANT_ID = "003";
    @Override
    public String getServiceID() {
        return MERCHANT_ID;
    }

    @Override
    public boolean openAccount() {
        System.out.println("Huaxia account opened!");
        return false;
    }
}
