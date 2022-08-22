package io.datajek.spring.basics.movierecommendersystem.Lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//class to find similar movies
@Component
public class RecommenderImplementation1 {
    @Autowired
    @Qualifier("CBF")
    private Filter filter;
    // public RecommenderImplementation(Filter filter){
    //     //invoking the parent class constructor
    //     super();
    //     this.contentBasedFilter = filter;
    // }



    //!!!!!!Important
    //dependency injection using setMethod
    @Autowired
    @Qualifier("CBF")
    public void setFilter(Filter filter){
        this.filter = filter;
    }
    public String[] recommendMovies(String movie){
        //we're hardcoding this to avoid compile time errors
        //we're using content based filter to find similar movies
        //return
        //Old implementation
        //Tight coupling
        // ContentBasedFilter filter = new ContentBasedFilter();
        // String[] results = filter.getRecommendation(movie);
        
        // return results;
        // return new String[] {"M1", "M2", "M3"};
        
        System.out.println("name of the filter is "+ filter + " \n");
        String[] results = filter.getRecommendation(movie);
        return results; 
    }
    
}
