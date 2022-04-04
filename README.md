# BuilderPattern
      
      
       Builder Pattern is the creational design pattern.It states that ,seperate the construction
of a complex object from its representation so that the same construction create a different 
representations. 
     
       In this project, it is a restaurant meal has  a burger and a coldDrink."Burger" class
inherit "VegBurger" and "ChickenBurger" and will be packed in "Wrapper"."ColdDrink" inherit
 "Pepsi" or "Coke" packed in a "Bottle".
      "ColdDrinks" and "Burgers" implement the  "Item" interface.
       "Wrapper" and "Bottle" is the concrete classes which implement the "Packing" interface.
        "Meal" is a concrete class having List of items and a "MealBuilder" class having different
types of meals."Main" will use "MealBuilder" to build a meal.     


JunitTest:
       The  Junit Test is done of all the entities in Builder pattern project and test coverage 
is 100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%.    
 
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradle sonarqube
       -Dsonar.projectKey=BuilderPattern
       -Dsonar.host.url=http://localhost:9000
       -Dsonar.login=8934b50c504b3affd56434a98fd991a3c0837b17