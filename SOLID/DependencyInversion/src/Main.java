/*

High level modules <-----> Low Level modules

This is not good. Better one is:


High Level Modules <-----> ABSTRACT (Interface) Modules <-----> Low Level Modules

- High level modules should not depend on low level modules
- Both should depend on abstraction
- Abstraction should not depend on Detail
- Details should depend upon abstractions

Dog dog = new Dog();

do not do this. But instead:

Animal dog = new Dog();



- avoid tightly coupled code
- creating an object with new keyword results in a class tightly coupled in another class

- dependency inversion principle helps to create loosely coupled classes



how ?

- using design patterns: factory, template or strategy patterns
- using service locator pattern
- dependency injection


PACKAGE A                         PACKAGE B

OBJECT A                          OBJECT B

   |                                 |
   |                                 |
   |  Reference                      |
   |                                 |
   V                                 |
Interface A  <-----------------------


High level modules should not depend on low level modules directly

*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //inject via constructor
        DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDatabase());

        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}
