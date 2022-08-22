package io.datajek.spring.basics.movierecommendersystem.Lesson9;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//contains the logic of getting recomendation based on content
@Component
//@Qualifier("CBF")
//@Primary
//@Scope("prototype")
public class ContentBasedFilter implements Filter {
    private static int instances = 0;
    @Autowired
    private Movie movie;

    public ContentBasedFilter(){
        super();
        instances++;
    }
    public Movie getMovie(){
        return movie;
    }
    public static int getInstances(){
        return ContentBasedFilter.instances;
    }
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Hello", "Bonjour", "Adios"};
    }
}
