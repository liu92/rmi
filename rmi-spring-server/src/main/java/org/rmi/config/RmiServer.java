package org.rmi.config;

import org.boot.service.HelloSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @ClassName RmiServer
 * @Description TODO
 * @Author liuwanlin
 * @Date 2019/8/16 17:28
 **/
@Configuration
public class RmiServer {

    @Autowired
    private HelloSpringService helloSpringService;


    public RmiServiceExporter getRmiServiceExporter(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("helloSevice");
        rmiServiceExporter.setService(helloSpringService);
        rmiServiceExporter.setServiceInterface(HelloSpringService.class);
        rmiServiceExporter.setRegistryPort(2002);
        return rmiServiceExporter;
    }
}
