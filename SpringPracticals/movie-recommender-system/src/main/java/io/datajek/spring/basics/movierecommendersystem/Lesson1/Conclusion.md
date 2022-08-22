# Points to Note
- Dependecy
- Content based implementation is a dependecy of recommender implementation (Recommender Implemention is dependent on CBF for it to work)
- We need to create an object of type content based filter in the recommender implementation to perform its task
- This is an example of tight coupling
- If we need to use another filter in place of content based filter we'll have to change the recommender Implementation class.
- Consider a scenario, where we want to use one type of filter in one situation and another type of filter in another situation. Tight coupling makes this difficult to achieve.
- In the simple example above, we created two classes which work together, thus creating a dependency. In a typical enterprise application,
there are a large number of objects which work together to provide some end result to the user. This results in a lot of dependencies. Spring is a
dependency injection framework that makes the process of managing these dependencies easy.