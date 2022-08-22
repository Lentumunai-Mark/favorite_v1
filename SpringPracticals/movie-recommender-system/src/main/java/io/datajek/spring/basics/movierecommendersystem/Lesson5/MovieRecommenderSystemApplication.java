package io.datajek.spring.basics.movierecommendersystem.Lesson5;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//beans created by spring are managed by application context
		//We can get info about a bean from application context
		//run method returns application context
		//getBean method of application context can be used to get bean of a particular class
		//bean is an object
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
   		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
    	String[] results = recommender.recommendMovies("halo");
    	System.out.println(Arrays.toString(results));
	}

}
