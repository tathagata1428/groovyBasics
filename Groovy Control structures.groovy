//if/else

def x = 5
if (x == 10) {
println "true"
}else{
print "no true"
}

//Clasic while

def i=1
while(i<=10) {
println i
i++
}

//for in list
def list = [1,2,3,4]
for ( num in list){
println num
}

//closure
def list2 = [1,2,3,4]

list2.each {println it}

//switch 

def mynumber = 10

switch(mynumber) {
case 1:
        println "number is 1"
        break
 default: 
     println "not in range" 
     
 }    
     
        




