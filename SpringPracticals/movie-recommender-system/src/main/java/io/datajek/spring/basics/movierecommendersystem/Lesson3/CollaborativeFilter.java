package io.datajek.spring.basics.movierecommendersystem.Lesson3;

import org.springframework.stereotype.Component;

//@Component
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Halo", "Hujambo", "Hi"};
    }
}
