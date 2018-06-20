/**
 *
 */
package com.trivia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * With Spring-Cloud-Security@1.1
 *
 * @see EnableResourceServer replace with @EnableOAuth2Resource
 */
@SpringBootApplication
public class Application {
    public static ApplicationContext context;

    public static void main(String[] args) throws Exception {
        Application.context = SpringApplication.run(Application.class, args);
    }


}
