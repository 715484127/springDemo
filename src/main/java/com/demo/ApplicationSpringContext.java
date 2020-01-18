package com.demo;

import com.demo.config.SpringConfig;
import com.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangyuepeng
 */
public class ApplicationSpringContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new
                AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService =  (UserService) annotationConfigApplicationContext.getBean("userServiceImpl");
        userService.addUser();

    }


}
