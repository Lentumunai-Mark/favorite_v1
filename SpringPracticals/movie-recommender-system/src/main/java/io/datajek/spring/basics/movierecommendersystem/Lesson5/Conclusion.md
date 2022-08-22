# AutoWiring by Name
- We specify bean to be used by name
- While creating an object dependency is injected by matching the name of the reference variable to the bean name
- Variable name must be same as bean Name
```java
    public class RecommenderImplementation{
        @Autowired
        Private Filter contentBasedFilter;
        public String[] recommendMovies(String movie){
        System.out.println("name of the filter is "+ filter + " \n");
        String[] results = contentBasedFilter.getRecommendation("Hello");
        return results; 
    }
    }
```
- For this no constructor
- Filtering by type has more precedence than name