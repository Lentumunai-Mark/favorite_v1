package io.datajek.spring.basics.movierecommendersystem.Lesson8;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
   		ContentBasedFilter recommender1 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter recommender2 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter recommender3 = appContext.getBean(ContentBasedFilter.class);
    	System.out.println(recommender1);
        System.out.println(recommender2);
        System.out.println(recommender3);
	}

}
