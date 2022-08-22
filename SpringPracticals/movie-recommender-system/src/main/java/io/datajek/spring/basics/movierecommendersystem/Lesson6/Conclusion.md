# AutoWiring by @Qualifier
- Suppose we want to use CBF instead of ContentBasedFilter
- We specify in @Component or @Qualifier
- @Component("CBF")
- @Qualifier("CBF")
```java
    @Component("CBF")
    public class ContentBasedFilter implements Filter{

    }
    //Alternatively
    @Component()
    @Qualifier("CBF")
    public class ContentBasedFilter implements Filter{

    }
```
- Now we can use @Qualifier in the RecommenderImplementation where dependency is injected to know which bean to use
```java
    public class RecommenderImplementation{
        @Autowired
        @Qualified("CBF")
        Private Filter filter;
        public String[] recommendMovies(String movie){

        }
    }
```
- Always Name has to match i.e, The name of the Filter implememtation used with the @Qualifier annotation (in this case, CBF) has to match the name used with the @Component (or @Qualifier ) annotation on the class.
- When the bean is run content based filter bean qualifies to be autowired
- You can add CF to collaborative filter but keep changing afterwards between CF and CBF in the Recommender Implementation Filter

## @Primary VS @Qualifier
- Qualifier takes precedence over @primary
- @Primary is more general
- @Primary is the default setting while @Qualifier is more specific
- @primary  defines default selection when no other selection is available.
- It tells Spring to use the bean marked as
primary as its first choice if it encounters more than one bean of the same
type.
- On the other hand, @Qualifier tells Spring to use a specific bean if it finds multiple beans of matching type.
