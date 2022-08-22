package io.datajek.spring.basics.movierecommendersystem.Lesson3;

import org.springframework.stereotype.Component;

//class to find similar movies
@Component
public class RecommenderImplementation {
    Filter filter;
    public RecommenderImplementation(Filter filter){
        //invoking the parent class constructor
        super();
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
