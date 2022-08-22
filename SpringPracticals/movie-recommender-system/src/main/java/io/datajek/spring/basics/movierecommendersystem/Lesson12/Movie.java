package io.datajek.spring.basics.movierecommendersystem.Lesson12;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static int instances = 0; 
    private int id;
    private String name;
    private String genre;
    private String producer;
    public Movie(){
        //invoking the parent constructor
        super();
        instances++;
        System.out.println("Movie constructor instances called");

    }
    @PostConstruct
    public void postConstruct(){
        logger.info("in movie postConstruct method");
    }
    public static int getInstances(){
        return Movie.instances;
    }
    @PreDestroy
    public void PreDestroy(){
        logger.info("In movie preDestroy method");
    }

}

