package io.datajek.spring.basics.movierecommendersystem.Lesson15;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//class to find similar movies
@Service
public class RecommenderImplementation {
    private Filter filter;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //using setter method to Autowire
    @Autowired
    public void setFilter(Filter filter){
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }
    @PostConstruct
    public void postConstruct(){
        //initialization goes here
        logger.info("In recommenderImplementation postConstruct method");
    }
    public String[] recommendMovies(String movie){
        System.out.println("name of the filter is "+ filter + " \n");
        String[] results = filter.getRecommendation(movie);
        return results; 
    }
    
}
