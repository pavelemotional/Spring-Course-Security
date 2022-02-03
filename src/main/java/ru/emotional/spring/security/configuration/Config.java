package ru.emotional.spring.security.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "ru.emotional.spring.security")
@EnableWebMvc
public class Config {
    
//    @Bean
//    public ViewResolver viewResolver(){
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/templates/");
//        viewResolver.setSuffix(".html");
//        return viewResolver;
//    }
}
