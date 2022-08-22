# Bean LifeCycle: Prototype Scoped Beans
- Spring manages the entire lifecycle of singleton beans, however what about the beans with prototype scope
- Spring can manage this, however spring can loose track of all instances of the beans, Hence we gotta manage this at times

- Another Section
- In the main method we will retrieve a singleton RecommenderImplementation and two prototype movie beans from the application context.
```java
    public static void main(String[] args){
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//Retrieving singleton bean from application context
RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
System.out.println(recommender);
//Retrieving prototype bean from application context twice
Movie m1 = appContext.getBean(Movie.class);
System.out.println(m1);
Movie m2 = appContext.getBean(Movie.class);
System.out.println(m2);
    }
```
- When the application is run, we can see that the constructor and postconstruct methods of the singleton RecommenderImplementation bean (and its dependency, ContentBasedFilter bean) are called when the bean is created, before the application starts.
- The prototype bean is not created beforehand and the constructor and post construct methods for the Movie bean are only called when we request the application context for the Movie bean.
- When the application terminates, the PreDestroy method is called for the singleton RecommenderImplementation bean (and its dependency
ContentBasedFilter bean) but not for the prototype scoped Movie bean.