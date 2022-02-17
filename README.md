# BuilderPattern
       Builder Pattern is the creational design pattern.It states that ,seperate the construction
of a complex object from its representation so that the same construction create a different 
representations. 
       In this project, it may be the restaurant meal has  a burger and a coldDrink.Burger 
could be either veg burger or chicken burger and will be packed in wrapper.Cold drink could
be either pepsi or coke packed in a bottle.
       Item is the interface representing food items such as cold drinks and burgers is the 
concrete classes which implement the item interface.Packing is the interface representing the 
packing of foods,wrapper and bottle is the concrete classes which implementing the packing 
interface as burger would be packed in wrapper and cold drik would be packed in bottle. 
Meal is a class having List of Item and a MealBuilder class having different types of meals.
Main will use MealBuilder to build a meal.     


JunitTest:
        There is JUnit Test also present for all Builder Pattern and test coverage are 100%
  successful by jacoco reports.
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradle sonarqube
       -Dsonar.projectKey=BuilderPattern
       -Dsonar.host.url=http://localhost:9000
       -Dsonar.login=8934b50c504b3affd56434a98fd991a3c0837b17