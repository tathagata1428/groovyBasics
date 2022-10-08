//Conditional Structures
//======================================

//If/else


def city = 'bucharest'
def skils = 'groovy'

if( city == 'bucharest' && skils=='groovy'){
println "Apply now Bob"}
else{println "Go avay"}

//IF/Else/Else if

def someAge = 99..100
if (someAge == 18 ){
println "buy some beer"
}
else if(someAge == 36){
println "save some money"
}
else{println "Aoleu"}

//===================================

//Switch statement

def num = 99
switch (num){
case 1 :
    println "1"
    break
    //range
case 1..5 :
    println"Bob the great"
    break
case [1,2,99]:
     println"number found" 
    break
default: 
    println "Ha ha ha"    
}

//in

def validAges = 18..35
def someAge = 20

println someAge in validAges

