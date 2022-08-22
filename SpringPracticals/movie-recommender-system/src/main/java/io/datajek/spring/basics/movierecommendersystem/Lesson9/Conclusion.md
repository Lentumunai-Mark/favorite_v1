# Mixing Bean scope
- The ContentBasedFilter bean has singleton scope because we need only one instance of the filter. However, the Movie bean has prototype scope because we need more than one objects of this class.
- Create a Movie class as hard coded
- We will modify the ContentBasedFilter class to create a variable instances for keeping track of the number of objects created. This variable is incremented in the constructor. We will also create a
dependency on the Movie class using the @Autowired annotation. Lastly, we will add a getter method for the dependency ( getMovie ) as shown below:
```java
@Component
public class ContentBasedFilter
implements Filter {
//for keeping track of instances created
private static int instances= 0;
@Autowired
private Movie movie;
public ContentBasedFilter() {
super();
instances++;
System.out.println("ContentBasedFilter constructor called");
}
public Movie getMovie() {
return movie;
}
public static int getInstances(){
    return ContentBasedFilter.instances;
    }
}
```
- When a prototype bean is injected into a singleton bean, it loses its prototype behavior and acts as a singleton.
- The same instance of the bean is returned by the application context every time it is requested using the getMovie method.
## Solving the above problem of not injecting a prototype bean in a Singleton one.
1. ## Proxy
- We declare the bean with prototype scope as proxy using proxyMode element inside scope annotation.
```java
    @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
```
- Singleton bean does not get autowired at time of creation instaead a proxy or placeholder object is autowired.
- The proxy mode allows Spring container to inject a new object into the singleton bean.