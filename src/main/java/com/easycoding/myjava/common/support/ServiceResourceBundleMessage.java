package com.easycoding.myjava.common.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class ServiceResourceBundleMessage {
    @Autowired
    @Qualifier("messageSource")
    protected ReloadableResourceBundleMessageSource messageSource;

    public String getMessage(String resourceName) {
        return this.getMessage(resourceName, null);
    }

    public String getMessage(String resourceName, Object[] args) {
        return messageSource.getMessage(resourceName, args, Locale.KOREA);
    }
}
