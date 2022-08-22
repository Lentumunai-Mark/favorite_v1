package io.datajek.spring.basics.movierecommendersystem.Lesson3;

import org.springframework.stereotype.Component;

//contains the logic of getting recomendation based on content
@Component
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Hello", "Bonjour", "Adios"};
    }
}
