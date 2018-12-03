package com.imcbb.factory;

import com.imcbb.service.FundService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author kevin
 */
@Component
public class MerchantFactory implements ApplicationContextAware {

    private static Map<String, FundService> SERVICE = new HashMap<>(0);

    public FundService getFundServiceById(String id) {
        return Optional.ofNullable(SERVICE.get(id))
                .orElseThrow(() -> new RuntimeException("商户ID:[" + id + "]服务找不到"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBeansOfType(FundService.class).forEach((k, v) -> SERVICE.put(v.getServiceID(), v));
    }
}
