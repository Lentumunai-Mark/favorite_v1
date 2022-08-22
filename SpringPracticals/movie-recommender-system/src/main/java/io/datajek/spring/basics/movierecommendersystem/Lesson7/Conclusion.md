# Dependency Injection
- To illustrate diffrent types of dependency Injection
- We'll have RecommenderImplementation1 and RecommenderImplementation
- One will show constructor and recommenderImplementation

# Dependency Injection By Constructor
- create a constructor in recommenderImplementation class that that initializes the filter to be used for finding movie recommendation
```java
    public RecommenderImplementation(Filter filter){
        this.filter = filter;
        sout("constructor invoked");
    }
```
- use diffrent beans in diffrent scenarios => @Qualifier
- Use a default bean @Primary (default choice)
- bean name is class name with first letter in lowercase
- IMPORTANT !!!!!
- To use constructor injection
- move @Autowired to the constructor
- we use @Autowired to inject bean of collaborative filter
- @Qualifier cannot be used in the constructor
- (as it results in an error message: “The annotation @Qualifier is disallowed for this location”)
- used in the argument list of the constructor right before the property you want to autowire

```java
    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {         this.filter = filter;
    System.out.println("Constructor invoked...");
}
```
- use of @Autowired is optional when using constructor injection.
- use a diffrent name apart from class name in @Quaalifier("diffrent Name") and @Component("diffrent Name")

## Dependency Injection by setter Method.
- involves creating a setter method
- create  a setter in Recommendation implementation2.
```java
    public void setFilter(Filter filter){
        this.filter = filter;
        sout("Setter method invoked..")
    }
```
- To guide spring using Setter method
- @Autowired
- @Qualifier("")
- In the main method, we will call the getBean method to show that
setter injection takes place and ContentBasedFilter bean is injected
```java

```

## Bonus Field injection
- Default injection without using Constructor and setter function is referred to as field injection.
```java

public class RecommenderImplementation {
@Autowired
private Filter filter;
//...
}
```
### Disadvantages of Field injection
- unsafe because Spring can set private fields of the objects
- Testing
also becomes inconvenient because we need a way to perform dependency injection for testing.
- Read pdf for comparison