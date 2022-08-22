package io.datajek.spring.basics.movierecommendersystem.Lesson11;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



//contains the logic of getting recomendation based on content
@Component
//@Primary
public class ContentBasedFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }
    @PostConstruct
    private void postConstruct() {
    //load movies into cache
    logger.info("In ContentBasedFilter postConstruct method");
    }
    @Override
    public String[] getRecommendation(String movie){
        return new String[] {"Hello", "Bonjour", "Adios"};
    }
}
