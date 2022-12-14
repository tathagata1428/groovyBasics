/* constructors:
Constructors are special methods used to initialize an object with a specific state.
As with normal methods, it is possible for a class to declare more than one constructor, so long as each constructor has a unique type signature.
If an object doesn’t require any parameters during construction, it may use a no-arg constructor.
If no constructors are supplied, an empty no-arg constructor will be provided by the Groovy compiler.

Groovy supports two invocation styles:

positional parameters are used in a similar to how you would use Java constructors

named parameters allow you to specify parameter names when invoking the constructor.


Methods:

A method is in Groovy is defined with a return type or with the def keyword.
Methods can receive any number of arguments. It’s not necessary that the types are explicitly defined when defining the arguments.
Modifiers such as public, private and protected can be added. By default, if no visibility modifier is provided, the method is public.

 */





@groovy.transform.ToString
class Person {

String first,last

//constructor 
Person(String fullName) {
List parts = fullName.split(' ')
first = parts[0]
last = parts[1]
    }

}
Person bob = new Person ("Bogdan Radu")
println bob