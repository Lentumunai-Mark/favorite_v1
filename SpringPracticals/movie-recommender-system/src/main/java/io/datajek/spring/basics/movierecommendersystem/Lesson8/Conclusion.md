# Bean Scope.
- Bean scope refers to the visibility and lifecycle of beans
- Tells us how many beans can be created and with how many instances and how long beans live.
# Singletone Scope
- Default bean scope
- One instance of a bean is created then cached in memory, multiple requests for the bean return a shared reference.
- Application context manages the beans and we can retrieve a bean using the getBean() method. If we request the application context for the ContentBasedFilter bean three times as shown, we get the same bean.
```java
public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
   		ContentBasedFilter recommender1 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter recommender2 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter recommender3 = appContext.getBean(ContentBasedFilter.class);
    	System.out.println(recommender1);
        System.out.println(recommender2);
        System.out.println(recommender3);
```
- This returns multiple shared references to the same bean.
- Singleton bean scope is the default scope. It is used to minimize the number of objects created.
- Beans are created when context is loaded and cached in memory.
- Prototype bean scope is used when we need to mantain the state of the beans.
- Singletone => stateless beans.

## Prototype Scope
- Changing the scope of the collaborative filter bean to prototype scope
- we will use @Scope annotation
- we import org.springframework.context.annotation.Scope
- ways to specify scope
```java
@Scope("prototype") //OR
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentBasedFilter{

}
```
## Conclusion
- spring creates a singleton bean even before we ask for it while a prototype bean is not created till we request Spring for the bean
- Singleton -: one bean per jvm
- Gang of four singleton -: one bean per jvm
- even if there were more than one application contexts running on the same JVM, there would still be only one instance of the singleton class.
