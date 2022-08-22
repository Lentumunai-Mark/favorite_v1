package io.datajek.spring.basics.movierecommendersystem.Lesson2;
//contains the logic of getting recomendation based on content
public class ContentBasedFilter implements Filter {
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Hello", "Bonjour", "Adios"};
    }
}
