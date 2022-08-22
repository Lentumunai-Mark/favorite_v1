package io.datajek.spring.basics.movierecommendersystem.Lesson9;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
   		//Retrieve singleton bean from application context
		ContentBasedFilter recommender1 = appContext.getBean(ContentBasedFilter.class);
        System.out.println("\nContentBasedFilter bean with singleton scope");
		System.out.println(recommender1);

		Movie movie1 = recommender1.getMovie();
		Movie movie2 = recommender1.getMovie();
		Movie movie3 = recommender1.getMovie();

		System.out.println("\nMovie bean with prototype scope");
		System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);

		//number of instances of each bean
		System.out.println("\nContentBasedFilter instances created: "+ContentBasedFilter.getInstances());
		System.out.println("Movie instances created: "+ Movie.getInstances());
	}
}


