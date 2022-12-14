/*

A closure in Groovy is an open, anonymous, block of code that can take arguments, return a value and be assigned to a variable. 
A closure may reference variables declared in its surrounding scope. 
In opposition to the formal definition of a closure, Closure in the Groovy language can also contain free variables which are defined outside of its surrounding scope.
*/
//Creating Closures

//how to define a closure
def c = {}

print c.class.name

//Simple closure example

def sayBob={
println "  Hello Bob"
}
sayBob()


// pass an argument to closure
sayHello = { name ->
println "Hello , $name"
}
sayHello('Dragos')

def nums = [1,2,7,94,28]
nums.each( {num ->
println num

})

// closures are objects &nlast param

def timesTen(num,closure) {
closure(num * 10)
}

timesTen(92, { println it})
timesTen(2) { 
    println it
    
    }
    
import java.util.Random
Random bob = new Random()

10000.times {
println bob.nextInt()
}

//Closure Parameters




