# Points to Note
- if we want to use collaborative filter we'll need to change the code in Recommender impl class
```java
    CollaborativeFilter filter = new CollaborativeFiler();
    String[] results = filter.getRecommendation("Hello");
    return results;
```
# How do we make our code Loosely coupled?
Such that we don't have to be changing code in recommender implementation every time.
### One  way is to use a filter
- filter contains abstract methods whose implementations is left to classes using it.
- let both classes i.e, dependecies of recommender implementation class implement the filter
## Loose Coupling
- Loose coupling can be achieved by making the Recommender Implementation use the interface instead of one of its own implementation
- Create Recommender Implementation constructor to initialize filter
- The method getRecommendation now belongs to the interface to check which implementation of the interface is being used to getMovie movie Recommendation
- By using the interface instead of an actual implementation, we can dynamically choose which algorithm to use. Our code has now become
loosely coupled. In the MovieRecommenderSystemApplication file, when we create a RecommenderImplementation object, we can pass the name of the filter to use:

```java
    RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
```
- Now we dont have to change code in the Recommender implementation class
-  In this lesson, we made RecommenderImplementation class independent of the filter implementation. The RecommenderImplementation now calls methods of the Filter interface.
- Now Filter is a dependency of RecommenderImplementation . We still have to create an object of RecommenderImplementation and an object of Filter and pass the objects to the constructor. In the next lesson, we will see how Spring takes over the job of managing dependencies.