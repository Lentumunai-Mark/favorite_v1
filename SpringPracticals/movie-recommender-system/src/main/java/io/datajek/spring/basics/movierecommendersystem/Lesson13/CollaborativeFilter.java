package io.datajek.spring.basics.movierecommendersystem.Lesson13;

import javax.inject.Named;


@Named
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Halo", "Hujambo", "Hi"};
    }
}
