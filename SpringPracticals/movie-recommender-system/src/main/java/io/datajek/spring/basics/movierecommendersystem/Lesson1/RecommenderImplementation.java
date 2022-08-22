package io.datajek.spring.basics.movierecommendersystem.Lesson1;
//class to find similar movies
public class RecommenderImplementation {
    public String[] recommendMovies(String movie){
        //we're hardcoding this to avoid compile time errors
        //we're using content based filter to find similar movies
        //return
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendation(movie);
        
        return results;
        // return new String[] {"M1", "M2", "M3"};
    }
}
