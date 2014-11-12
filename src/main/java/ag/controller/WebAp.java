
package ag.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author T107
 */
public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Caragando configuracion de clases config !!");
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Caragando configuracion de Servlets !!");
        return new Class <?>[]{WebApConfig.class};
    
    }
    
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Caragando configuracion de cservicios!!");
        return new String[]{"/Servicios/*"};

    }
    
}
