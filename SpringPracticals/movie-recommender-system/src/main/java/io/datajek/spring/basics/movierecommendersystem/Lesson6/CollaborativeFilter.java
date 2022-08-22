package io.datajek.spring.basics.movierecommendersystem.Lesson6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Halo", "Hujambo", "Hi"};
    }
}
