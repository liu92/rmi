package org.rmi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @ClassName RmiClient
 * @Description TODO
 * @Author liuwanlin
 * @Date 2019/8/16 17:35
 **/
@Configuration
public class RmiClient {
    @Bean(name = "userService")
    public RmiProxyFactoryBean getUserService() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://127.0.0.1:2002/userService");
//        rmiProxyFactoryBean.setServiceInterface(IUserService.class);
        return rmiProxyFactoryBean;
    }
}
