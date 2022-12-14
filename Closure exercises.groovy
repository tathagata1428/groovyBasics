def mymethod(Closure c) {

c()

}

def foo ={
println "foo.."

}

mymethod(foo)

def names = ["Bogdan", "Radu"]

names.each { name ->
 println name }
 
 
 def greet = { String bob , String botza ->
 println "$bob, $botza"
 
 }
 
 greet ("Salut","Bogdan")