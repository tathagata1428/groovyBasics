//maps vs List
//defining a map map =[:]
//Defining a list list=[]

def person = [fist:"Bogdan",last:"Radu", email:"bogdan.radu@b4it.ro"]
println person
println person.getClass().getName()
println person.last

//add a new to keyvaley to the map

person.twitter = "@tethagata94"
println person

def Emailadress ="EmailAdress"
def twitter = [username:"tathagata94",(Emailadress):"Bogdan.radu@b4it.ro"]
println twitter.size()

//looping through person
for (entry in person ) { 
println entry}

for (key in person.keySet() ) {
println "$key:${person[key]}"

}

