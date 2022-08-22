package io.datajek.spring.basics.movierecommendersystem.Lesson8;

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
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Hello", "Bonjour", "Adios"};
    }
}
