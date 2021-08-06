package com.stancu.customerrestapi.boostrap;

import com.stancu.customerrestapi.CustomerRestApiApplication;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                CustomerRestApiApplication.class
        };
    }


    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }
}

