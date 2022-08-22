package io.datajek.spring.basics.movierecommendersystem.Lesson1;

import java.util.Arrays;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation filter = new RecommenderImplementation();
		String[] result = filter.recommendMovies("Antman");
		System.out.println(Arrays.toString(result));
	}

}
