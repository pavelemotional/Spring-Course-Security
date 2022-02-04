package ru.emotional.spring.security.configuration;



import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Driver;


@Configuration
@ComponentScan(basePackages = "ru.emotional.spring.security")
@EnableWebMvc
public class Config {



}
