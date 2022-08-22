# Bean Life Cycle
## @PostConstruct And @PreDestroy
## Using Logger to debug
- Loggers offer flexibility, as well as better output, that includes timestamp, name of the thread executing the code, and the name of the class. This information comes in handy.
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class RecommenderImplementation {
private Logger logger = LoggerFactory.getLogger(this.getClass());
//...
}
```
- Similarly we'll declare logger in ContentBasedFilter class.
- Have a setter method to inject the filter as well in Recommender Implementation.
```java
@Component
public class RecommenderImplementation {
//...
private Filter filter;
@Autowired
public void setFilter(Filter filter) {
logger.info("In RecommenderImplementation setter method..dependency injection");
this.filter = filter;
    }
//...
}
```
# @PostConstruct
- When spring creates a  bean the first thing it does is that it autowires the dependencies.
- if a dev wants to perform a task after dependency has been populated, it can be done by callin @PostConstruct annotation which works like init method
- @PostConstruct annotation tells Spring to call the method for us once the object has been created
- Return type of this method is always void.
- We will create @Postconstruct method in RecommenderImplementation class
```java
@Component
public class RecommenderImplementation{
    @PostConstruct
    public void postConstruct(){
        //initialization goes here
        logger.info("In recommenderImplementation postConstruct method");
    }
}
```
```java
@Component
public class ContentBasedFilter implements Filter{
//...
    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }
    @PostConstruct
    private void postConstruct() {
    //load movies into cache
    logger.info("In ContentBasedFilter postConstruct method");
    }
//...
}
```
- @Postconstruct is used on a method when you want it to behave like the init method
- After the dependency injection function annotated with @Postconstruct is run
- @PostConstruct annotation tells Spring to call the method for us once the object has been created.
## Bonus
- Order occurs as follows
- ContainerStarted => BeanInstantistion => DependencyInjection => PostConstruct Method => Bean ready

- The constructor of the ContentBasedFilter class is called. After the constructor method, the PostConstruct method is called.When the bean has been created, it is injected into the RecommenderImplementation bean as can be seen from the logger output of the setter method. After the dependency has been injected into the RecommenderImplementation bean, its PostConstruct
method is called. Now the bean is ready for use and is returned by the getBean() method after which the bean name is printed.

## @PreDestroy
- Callback method that is executed just before a bean is destroyed.
- A method with the @PreDestroy annotation can be used to release resources or close a database connection.
```java
@Component
public class RecommenderImplementation{
    @PreDestroy
    public void preDestroy(){
        //cleanup code
logger.info("In RecommenderImplementation preDestroy method")
    }
}
```
```java
public class ContentBasedFilter implements Filter{
    @PreDestroy
    logger.info("In ContentBasedFilter preDestroy method");
}
```
# Bonus
- @Predestroy method can be used to cut all connections to the database