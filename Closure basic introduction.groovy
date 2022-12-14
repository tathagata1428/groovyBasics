/* 

**Block of code that can**:

- take paremeters
- refer variables
- return values
- can be passed as parameter in a method



 
 
*/
 
 def myclosure0 = {println "this is a closure"}

myclosure0.call()



//pass a variable to the closure

def greeting = "HI there!"

def myclosure = {name ->
println "greetings $name"}



// find an element in a list



myclosure.call("Bogdan")


//pass Closure as a parameter to a method

def myMethod(close) { close.call ("Ionut")

}
myMethod(myclosure)


def Closure3 ={

a,b,c ->
println (a+b+c)}

Closure3(1,79,96)
  

def Closure4 ={
d,f,g ->
return (d-f+g)

}

def opt = Closure4(10,94,100)
println opt


//Find an element in a list

def winningNumbers = [1, 5, 15, 94]
println winningNumbers.find {item -> item == 94}
println winningNumbers.findAll { item -> item >6}

println winningNumbers.any {item -> item <99}

println winningNumbers.every {item -> item == 99}

def multiplied = winningNumbers.collect {item -> item *120}

println multiplied
