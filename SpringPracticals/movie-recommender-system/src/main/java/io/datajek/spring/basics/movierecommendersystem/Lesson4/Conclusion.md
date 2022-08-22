# @Primary
- Autowiring by @Primary
- How spring Dynamically autowires a dependency in case it finds more than one component of same type
- We have two components of type filter
- Hence will throw @NoUniqueBeanDefinition since it finds two beans to be autowired
- @primary annotation can be used to remove this Exception
- if spring finds two components to be autowired and one has primary it autowires the primary one
- Using primary is autowiring by type
- We are looking for instances of type filter in our case 