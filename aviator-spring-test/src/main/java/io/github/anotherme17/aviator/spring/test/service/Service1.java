package io.github.anotherme17.aviator.spring.test.service;

import org.springframework.stereotype.Service;

/**
 * @author lirenhao
 * date: 2024/4/9 17:32
 */
@Service("service1")
public class Service1 {

    public void print(String str) {
        System.out.println(str);
    }
}
