package org.rmi.service.impl;

import org.boot.service.HelloSpringService;
import org.springframework.stereotype.Service;

/**
 * @ClassName HelloSpringServiceImpl
 * @Description TODO
 * @Author liuwanlin
 * @Date 2019/8/16 16:54
 **/
@Service
public class HelloSpringServiceImpl implements HelloSpringService {
    @Override
    public String sayHello(String name) {
        return "Spring: hello," + name;
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
