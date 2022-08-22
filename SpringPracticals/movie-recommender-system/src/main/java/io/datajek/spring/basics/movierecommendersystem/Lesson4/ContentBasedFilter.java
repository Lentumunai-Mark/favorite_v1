package io.datajek.spring.basics.movierecommendersystem.Lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//contains the logic of getting recomendation based on content
@Component
@Primary
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Hello", "Bonjour", "Adios"};
    }
}
