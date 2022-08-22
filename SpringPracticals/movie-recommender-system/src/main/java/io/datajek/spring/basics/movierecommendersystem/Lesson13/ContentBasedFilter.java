package io.datajek.spring.basics.movierecommendersystem.Lesson13;
import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;


//import org.springframework.context.annotation.Primary;




//contains the logic of getting recomendation based on content
@Named
@Qualifier("CBF")
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
