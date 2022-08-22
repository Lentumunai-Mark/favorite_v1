package io.datajek.spring.basics.movierecommendersystem.Lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//contains the logic of getting recomendation based on content
@Component
@Qualifier("CBF")
//@Primary
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Hello", "Bonjour", "Adios"};
    }
}
