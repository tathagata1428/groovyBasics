

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