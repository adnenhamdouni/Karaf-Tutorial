package net.lr.tasklist.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

@Singleton
public class TaskServiceRestExporter {
    @Inject
    TaskServiceRest taskServiceRest;
    
    @Inject
    Bus bus;
    
    private Server server;

    @PostConstruct
    public void create() {
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setAddress("/tasklistRest");
        factory.setServiceBean(taskServiceRest);
        factory.setBus(bus);
        server = factory.create();
        server.start();
    }
    
    @PreDestroy
    public void destroy() {
        server.destroy();
    }
}
