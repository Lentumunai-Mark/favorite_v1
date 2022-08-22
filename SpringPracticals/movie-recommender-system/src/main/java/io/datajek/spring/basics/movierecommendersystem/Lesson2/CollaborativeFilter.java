package io.datajek.spring.basics.movierecommendersystem.Lesson2;

public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Halo", "Hujambo", "Hi"};
    }
}
