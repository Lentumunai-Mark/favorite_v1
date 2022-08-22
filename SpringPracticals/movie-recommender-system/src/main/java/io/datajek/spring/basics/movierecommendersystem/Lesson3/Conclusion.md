# Managing Beans and Dependencies
## Beans
- Refers to objects or instances managed by Spring
- Spring require info about 3 things for it to manage beans
1. Beans
2. Dependencies
3. Location
## @Component
- Telling Spring that this is a bean
- We want to manage objects of
1. RecommenderImplementation
2. ContentBasedFilter
- My spring container will have two beans RecommenderImplementation and ContentBasedFilter
## @Autowired
- Second that spring needs to know is the dependencies of each object.
- @Autowired is used for this purpose
- In our case contentbasedfilter class which implements the filter interface is a dependency of RecommenderImplementation class.
```java
    @Component
    public class RecommenderImplementation {
        //we tell spring using @Autowired that(RecommenderImplementation) we need/s an object of type Filter
        //in other word filter is a dependency of RecommenderImplementation
        @Autowired
        private Filter filter;
        // ...
    }
```
## @ComponentScan
- The third thing that spring requires from any dev is location of the bean so that it can find them and autowire the dependencies
- @ComponentScan is used for this
- tells spring to scan a specific package and subpackages
- can be used without arguments
- Since we are using @SpringBootApplication in  MovieRecommenderSystemApplication class it is equivalent to the following annotations
1. @Configuration - Declares class as source for bean definitiion
2. @EnableAutoConfiguration - Allows application to add beans using class path definition
3. @ComponentScan - Directs spring to search for a component at a specified path
- Because of SpringBootApllication we dont need to use @componentSan

## Bonus
When we use the above the following line in our code becomes redundant
```java
    RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilte());
```
- Beans that spring creates are managed by the application context.
- We can get information about the bean from the application context
- run method retuns the application context which can be assinged to a variable
- getBean method of the application context can be used to get bean of a particular class
```java
    ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
    RecommendedImplementation recommender = appContext.getBeans(RecommenderImplementation.class);
    String[] results = recommender.recommendMovies("halo");
    System.out.println(Arrays.toString(results));
```