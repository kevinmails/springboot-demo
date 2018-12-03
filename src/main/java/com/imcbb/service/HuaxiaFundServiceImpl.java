package com.imcbb.service;

import com.imcbb.bean.FundMerchant;
import org.springframework.stereotype.Service;

/**
 * @author kevin
 */
@Service("huaxiaFund")
public class HuaxiaFundServiceImpl implements FundService {
    @Override
    public String getServiceID() {
        return FundMerchant.MERCHANT_ID_HUAXIA;
    }

    @Override
    public boolean openAccount() {
        System.out.println("Huaxia account opened!");
        return false;
    }
}
