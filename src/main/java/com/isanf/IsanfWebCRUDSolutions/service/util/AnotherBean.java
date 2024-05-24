package com.isanf.IsanfWebCRUDSolutions.service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//R 10        En supprimant, @Component ici LazyBean sera désactivée    
@Component
public class AnotherBean {
    private final LazyBean lazyBean;

    @Autowired
    public AnotherBean(LazyBean lazyBean) {
    	System.out.println("Bean initialized!");
        this.lazyBean = lazyBean;
    }
}
