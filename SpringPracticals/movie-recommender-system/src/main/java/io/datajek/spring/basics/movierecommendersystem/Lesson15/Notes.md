# Stereotype Annotations
Beans can be declared using the @Bean annotation in a configuration
class or by using the @Controller , @Service , and @Repository
annotations. These annotations are used at different layers of an
enterprise application.
Layers of An enterprise application include
 - Web Interface (Web Layer)
 - Service Interface (Service Layer)
 - DAO interface (Data Access Layer)
Beans can be declared using the @Bean annotation in a configuration
class or by using the @Controller , @Service , and @Repository
annotations. These annotations are used at different layers of an
enterprise application.

@Component is a generic annotation. It
can be used in any layer, if the developer is unsure about where the bean
belongs. The other three annotations, @Controller , @Service , and
@Repository , are specific to layers.

# @Controller
- @Controller is used to define a controller in the web layer. Spring scans
a class with @Controller to find methods that are mapped to different
HTTP requests. 
- It makes sure that the right view is rendered to the user.
@RestController is a specialized form of @Controller .

# @Service
- @Service is used in the business layer for objects that define the business
logic. It marks a class as a service provider.

# @Repository
- @Respository is used in the data layer to encapsulate storage, retrieval,
and search in a typical database. This annotation can also be used for
other external sources of data.
## Bonus
In our application, RecommenderImplementation class has business logic
so we can replace @Component with @Service . The filter algorithms also
fall in the category of business logic, and thus we can use @Service on
ContentBasedFilter and CollaborativeFilter classes. The Movie class
loads movie data from a movie repository so we will replace the
@Component annotation with @Repository annotation. When the
application is run after changing the annotations, there is no change in
terms of functionality.


## Bonus V2
- The advantage of having annotations specific to every layer instead of the
generic @Component is in Aspect Oriented Programming (AOP). We can
identify the annotations and add functionality to specific annotations.
- Similarly, we can classify components in different categories and apply a
specific logic to each category. For example, if we want to log everything
that is coming from the business layer, we can identify objects with the
@Service annotation using AOP and log all the content.

- Spring provides a default exception translation facility for JDBC
exceptions if the @Repository annotation is used. This feature cannot be
used on beans annotated with @Component . When using a persistence
framework like Hibernate, exceptions thrown in a class with the
@Repository annotation are caught and automatically translated into
Spring’s DataAccessException class.
- Likewise, the request mapping feature is enabled only when using the
@Controller annotation. The DispatcherServlet automatically looks for
@RequestMapping for classes marked with the @Controller annotation
only.
- The @Controller , @Service , and @Repository annotations are similar to
@Component annotation with respect to bean creation and dependency
injection, except that they provide specialized functionality.