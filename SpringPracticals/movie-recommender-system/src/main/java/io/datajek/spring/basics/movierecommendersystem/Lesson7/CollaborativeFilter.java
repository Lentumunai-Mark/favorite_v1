package io.datajek.spring.basics.movierecommendersystem.Lesson7;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Halo", "Hujambo", "Hi"};
    }
}
